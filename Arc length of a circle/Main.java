#include<stdio.h>
int main()
{
  float r,c,pi=3.14,arc;
  scanf("%f%f",&r,&c);
  arc=(2*pi*r)*(c/360);
  printf("%.2f",arc);
  return 0;
}