import java.util.Scanner;
import java.lang.*;
public class coinremoval {
    public static void main(String[] args)
    {
        char c1,c2,c3;int post,count=0,count1=0;
        StringBuilder s = new StringBuilder("THHTHHH");
        while(!"________".equals(s)) {
            System.out.println(s);
            for (int i=1;i<=s.length();i++)
                System.out.print(i);
            for (int i=0;i<s.length();i++)
                if ('H' == s.charAt(i))
                    count=1;
            if (count==0)
                break;
            count=0;

            System.out.println("\nEnter the position to delete");
            Scanner sc = new Scanner(System.in);
            pos = sc.nextInt();
            pos = pos - 1;
           
            if (post <= s.length())
            {

                if (s.charAt(post) == 'T' || s.charAt(post) == '_') {
                    System.out.println("You are entered the tail position or already deleted position " +
                            " Please enter the head position or unremoved position to remove");

                } else {

                    if (post <= 0) {
                        // System.out.println("check : "+post);
                        c1 = s.charAt(post);
                        c2 = s.charAt(post + 1);
                    } else if (post >= s.length() - 1) {
                        c1 = s.charAt(post - 1);
                        c2 = s.charAt(post);
                    } else {
                        c1 = s.charAt(post - 1);
                        c2 = s.charAt(post + 1);
                    }


                    switch (c1) {
                        case 'H':
                            s.setCharAt(getpost((post - 1), s), 'T');
                            break;
                        case 'T':
                            s.setCharAt(getpost((post - 1), s), 'H');
                            break;
                    }
                    switch (c2) {
                        case 'H':
                            s.setCharAt(getpost(post + 1, s), 'T');
                            break;
                        case 'T':
                            s.setCharAt(getpost(post + 1, s), 'H');
                            break;
                    }
                    s.setCharAt(post, '_');
                }

            }
            else
            {
                System.out.println("Please enter only available position to delete");
            }

        }
        for (int i=0;i<s.length();i++)
        {
        if (s.charAt(i)=='_')
            count1++;
        }
        if (count1==s.length())
            System.out.println("\nCongrats..You Have Won the game");
        else
            System.out.println(count1+s.length()+"\nThere is no way.  You have to accept that you are failed");

}


    private static int getpos(int i,StringBuilder s) {
            if(i<=0)
                return 0;
        else if (i>=s.length())
                return i-1;
        else
                return i;

    }
} 