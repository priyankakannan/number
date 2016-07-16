/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeven;

import java.util.Scanner;

public class Oddeven {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      if(n%2==0)
      { System.out.println("even");
      }else
      {
          System.out.println("odd");
      }
    }
}
