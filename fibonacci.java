
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,i,n,output1 = 0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            output1=a+b;
            a=b;
            b=output1;
            
        }
        System.out.println(output1);
    }
}
