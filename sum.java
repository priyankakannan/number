
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class sum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        int r,p=0,j=0;
        while(a>0)
        {
            r=a%10;
            a=a/10;
           p=p+r;
        }
        System.out.println(p);
    }
}
