#include <stdio.h>
#include <stdlib.h>

#define N 2048 // 行列サイズ

#define BSX 2 // x方向のブロック内スレッド数
#define BSY 2 // y方向のブロック内スレッド数
              // ブロック内スレッド数は合計BSX*BSY個になる．
              // 第1回資料を参照し，良い性能を得ることができるように
              // スレッド数をいろいろ変更する．

// 行列を表示する（N<=16の場合のみ）
void printMatrix(float a[][N], const char *str)
{
#if (N <= 16)
  printf("==== %s ====\n", str);
  for (int i = 0; i < N; i++)
  {
    for (int j = 0; j < N; j++)
    {
      printf("%4.0f ", a[i][j]);
    }
    printf("\n");
  }
#endif
}

// 行列にランダムな値を設定する
void initMatrix(float a[][N])
{
  for (int i = 0; i < N; i++)
  {
    for (int j = 0; j < N; j++)
    {
      a[i][j] = (int)((rand() / (RAND_MAX + 1.0)) * 10); // 0以上10未満の乱数
    }
  }
}

int main(void)
{
  float a[N][N], b[N][N], c[N][N], cs[N][N]; // ホスト上に確保した2次元配列（行列）
  float(*adev)[N], (*bdev)[N], (*cdev)[N];   // デバイス上に確保した2次元配列を指すポインタ

  // ホスト上の配列に初期値を設定する
  initMatrix(a);
  initMatrix(b);
  printMatrix(a, "a");
  printMatrix(b, "b");

  ////// ここから， 確認のためのCPU版行列積 ///////////////////////

  printf("\nCPU上の行列積を開始します\n");
  for (int i = 0; i < N; i++)
  {
    for (int j = 0; j < N; j++)
    {
      cs[i][j] = 0.0;
    }
  }
  for (int i = 0; i < N; i++)
  {
    for (int k = 0; k < N; k++)
    {
      for (int j = 0; j < N; j++)
      {
        cs[i][j] += a[i][k] * b[k][j];
      }
    }
  }
  printMatrix(cs, "cs");

  ////// ここまでCPU版行列積 ////////////////////////////////////////

  return 0;
}
