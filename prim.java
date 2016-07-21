
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class prim {
    public static void main(String args[]){

    int i,j,sum=0,kk=0,nl,m;
    int[] a=new int[100];
System.out.println("Enter the number");
  Scanner sc=new Scanner(System.in);
nl=sc.nextInt();
for(i=2;i<=nl;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
{

break;
}

}
if(i==j)
{
a[kk]=i;

kk++;
}
}

for(i=0;i<kk-2;i++)
{
for(j=i+1;j<kk-1;j++)
{
    for(m=j+1;m<kk;m++)
    {
sum=a[i]+a[j]+a[m];
if(sum==nl)
{
System.out.println("["+a[i]+","+a[j]+","+a[m]+"]");
}
}
}
    }

    }
}
