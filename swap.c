#include<stdio.h>
#include<string.h>
#include<stdlib.h>
main(){
	char *b,t,t1;
	int j;
	a=malloc(1000000);
	scanf("%s",b);
	j=0;
	if(strlen(b)%2!=0){
	t1=*(b+(strlen(b)-1));
	}
	while(j<strlen(b)){
		t=*(b+j);
		*(b+j)=*(b+(j+1));
		*(b+(j+1))=t;
		j=j+2;
	}
	*(b+(strlen(b)-1))=t1;
	printf("%s",b);
	}
