#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c;
 float r1,r2,real,img,de;
  scanf("%f\n%f\n%f",&a,&b,&c);
 de=((b*b) - (4*a*c));
  if(de>0)
  {
    r1 = (-b + sqrt(de))/(2*a);
    r2 = (-b - sqrt(de))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(de == 0)
  {
    r1=r2=(-b/(2*a));
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
    else
    {
      real = (-b/(2*a));
      img = sqrt(-de)/(2*a);
      printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,img,real,img);
    }
 return 0;
}