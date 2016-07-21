
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class oddn {
      public static void main(String[] args) {
        int mp,ij;
        Scanner sc=new Scanner(System.in);
        mp=sc.nextInt();
        for(ij=0;ij<mp;ij++){
            if(ij%2!=0)
                System.out.println(ij);
        }
    }
}
