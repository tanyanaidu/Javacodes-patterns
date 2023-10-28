class Pat16{
public static void main(String[] args){
int i,j,k;
for(i=1;i<=5;i=i+1){
for(j=1;j<=5-i-1;j=j+1){
System.out.print(" ");
}
for(j=1;j<=i;j=j+1){
System.out.print(j);
}
for(j=i-1;j>=1;j=j-1){
System.out.print(j);
}
System.out.println();
}
}
}

/* 
    1
   121
  12321
 1234321
123454321
*/


