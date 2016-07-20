
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class rev {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc= new Scanner(System.in);
        s1=sc.nextLine();
        s2= new StringBuffer(s1).reverse().toString();
        System.out.println(s2);
    }
}
