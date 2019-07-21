#include<stdio.h>
int main()
{
  int d;
  float area,r,pi=3.14;
  scanf("%d",&d);
  r=(float)d/2;
  area=pi*r*r;
  printf("%0.2f",area);
  return 0;
}