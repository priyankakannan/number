
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int i,sum=0;
        float avg;
        int[]a=new int[10];
        Scanner obj=new Scanner(System.in);
        for(i=0;i<10;i++)
            a[i]=obj.nextInt();
        for(i=0;i<10;i++)
            sum=sum+a[i];
        avg=(float)sum/10;
        System.out.println("average is:"+avg);
    }
    
    
}