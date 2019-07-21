#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,hypo;
  scanf("%f%f",&a,&b);
  c=(a*a)+(b*b);
  hypo=sqrt(c);
  printf("%0.2f",hypo);
  return 0;
}