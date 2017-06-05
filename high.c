#include<stdlib.h>
#include<stdio.h>
void main()
{
int i,a[10],n;
scanf("%d",n);
for(i=0;i<n;i++)
{
scanf("%d",a[i]);
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
int t;
t=a[i];
a[i]=a[j];
a[j]=t;
}
 }
  }
  printf("\n The highest number is...");
  printf("%d",a[0]);
  printf("\n The lowest number is...");
  printf("%d",a[n-1]);
  }
