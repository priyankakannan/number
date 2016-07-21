
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class hjk {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner s1=new Scanner(System.in);
        String a=s1.nextLine();
        int l=a.length();
        System.out.println("length is"+l);
        char b;
        String s2=" ";
        for(int i=0;i<l;i++)
        {
            b=a.charAt(i);
            if(b!=' ')
            {
                s2=s2+b;
                a=a.replace(b,' ');
            }}
        System.out.println("result:"+s2);
     }
        }
        
        
    
    

