import java.util.*;
public class minimum 
{
public static void main(String ar[])throws Exception
{
    int r,i,k;
    int p[]=new int[100];
Scanner sc=new Scanner(System.in);
minimum m1=new minimum();
String a=new String();
a=sc.next();
k=sc.nextInt();
int nk=Integer.parseInt(a);
i=0;
while(nk>0)
{
r=nk%10;
p[i++]=r;
n/=10;
}
m1.sort(p,k,i);
}
public void sort(int l[],int m,int g)
{
    int t;
for(int i=0;i<g-1;i++)
{
for(int j=i+1;j<g;j++)
{
if(l[i]>l[j])
{
t=l[i];
l[i]=l[j];
l[j]=t;
}
}
}
for(int i=0;i<m;i++)
    System.out.print(l[i]);
}
}