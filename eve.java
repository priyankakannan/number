
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class eve {
     public static void main(String[] args) {
        int m,j;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        for(j=0;j<m;j++){
            if(j%2==0)
                System.out.println(j);
        }
    }
}
