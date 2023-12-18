#include<stdio.h>
#include<conio.h>
void main(){
int a,b;
char op;
printf("enter the expression:");
scanf("%d%c%d",&a,&op,&b);
switch(op){
case '+':
printf("sum is:",a+b);
break;
case '-':
printf("difference is:",a-b);
break;
default:
printf("invalid");
}
}

