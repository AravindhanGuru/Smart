#include<stdio.h>
int main()
{
int a, n, sum = 0;
scanf ("%d", &n);
for (a = 1; a <= n; a++)
{
sum = sum + a;
}
printf("the sum of natural numbers is %d",sum);
getch();
return 0;
}
