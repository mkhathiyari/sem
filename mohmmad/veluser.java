import java.util.Scanner;
class veluser
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter username:");
		
		String userName=scan.nextLine();
		System.out.println("User Name is"+userName);
	}
}