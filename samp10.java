public class Palindrome {

	
	public static void main(String[] args) {
		StringBuffer sc=new StringBuffer(args[0]);
StringBuffer mathi=sc.reverse();
if(mathi.toString().equals(args[0]))
	System.out.println("THE GIVEN STRING IS PALINDROME");
else
	System.out.println("THE GIVEN STRING IS NOT A PALINDROME");
	}

}