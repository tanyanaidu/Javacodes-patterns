class Pat14{
public static void main(String[] args){
int i,j,k=0,l=1;
for(i=0;i<=5;i=i+1){
l=i;
for(j=1;j<=i;j=j+1){
System.out.print(l);
l=l+j;
}
System.out.println();
}
}
}


/*
1
23
346
45710
5681115
                                                                                    
*/
