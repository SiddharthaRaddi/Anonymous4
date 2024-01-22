void push(int value){
if(isfull()){
printf("overflown\n");
}else{
top++;
arr[top]=value;
}
}
