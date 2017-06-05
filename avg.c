#include<stdlib>
void main()
{
int n,i,a[];
printf("Enter the array size");
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
sum=sum+a[i];
}
sum=sum/n;
printf("%d",sum);
}
