class Patt8{
public static void main(String[] args){
int i,j;

for (i=1;i<=5;i=i+1){
for (j=1;j<=i;j=j+1){
if ((i+j)%2==0){
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
1
01
101
0101
10101
*/