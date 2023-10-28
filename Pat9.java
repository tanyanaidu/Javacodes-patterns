class Pat9{
public static void main(String[] args){
int i,j,k=0;
for(i=1;i<=5;i=i+1){
for(j=1;j<=5-i-1;j=j+1){
System.out.print(" ");
}
while(k!=(2*i-1)){
System.out.print("*");
k=k+1;
}
k=0;

System.out.println();
}
}
}

/*
    *
   ***
  *****
 *******
*********
*/
