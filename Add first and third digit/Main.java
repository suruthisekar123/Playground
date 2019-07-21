#include<stdio.h>
int main()
{
  int n,c,r,a;
  scanf("%d",&n);
  r=n/100;
  a=n%10;
  c=r+a;
  printf("%d",c);
  return 0;
}