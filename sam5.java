public class prime {
 
public static void main(String[] args) {
 
int n=50;
int c=0;
 
for(int i=2;i<=n;i++){
 
c=0;
 
for(int j=2;j<=i/2;j++){
 
if(i%j==0){
c++;
break;
}
 
}
 
if(c==0){
 
System.out.println(i);
 
}
 
}
 
}