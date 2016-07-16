
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class cc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
      char n=sc.next().charAt(0);
      if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
      {
          System.out.println("Vowels");
      }else
      {
          System.out.println("consonants");
    }
}}
