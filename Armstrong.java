/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int n,n1,n2,sum=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n1=n;
        while(n1!=0)
        {
            n2=n1%10;
            sum+=n2*n2*n2;
            n1=n1/10;
        }
        if(sum==n)
            System.out.println("Armstrong numer ");
        else
            System.out.println("Not an armstrong ");
    }
    }

