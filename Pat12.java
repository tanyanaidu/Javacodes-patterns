class Pat12{
public static void main(String[] args){
int i,j,k=0,l=15;
for(i=0;i<=5;i=i+1){
for(j=1;j<=i;j=j+1){
System.out.print(l+" ");
l=l-1;
}
System.out.println();
}
}
}

/*
15
14 13 
12 11 10 
9 8 7 6
5 4 3 2 1
*/
