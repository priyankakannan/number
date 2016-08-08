public class Dig {

   
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int num = 0,result=0;
      while(n>0)
      {
          num=n%10;
          n=n/10;
          result=result*10+num;
          
      }
        System.out.println("reverse the number"+result);
    }
}