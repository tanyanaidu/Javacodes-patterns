class Pat5{
public static void main(String[] args){
int i,j;

for (i=5;i>=1;i=i-1){
for (j=1;j<=i;j=j+1){
if (j%2!=0){
System.out.print("1");
}
else{
System.out.print("0");
}
}
System.out.println();
}
}
}

/*
10101
1010
101
10
1
*/


