import java.util.Scanner;

public class mod {

	public static void main(String[] args) {
		int a1,b,c;
		System.out.println("Enter the first number");
		Scanner s=new Scanner(System.in);
		a1=s.nextInt();
		System.out.println("Enter the second number");
		b=s.nextInt();
		System.out.println("The modulation is");
		c=a1%b;
		System.out.println(c);

	}

}