
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class palindrome {
     public static void main(String args[]){
        
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        System.out.println("the string is:"+s1);
        s2=new StringBuffer(s1).reverse().toString();
        System.out.println("the reversed string is:"+s2);
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Palindrome"); 
        }
        else
            System.out.println("not a palindrome");
        
    }
}
