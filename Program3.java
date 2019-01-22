import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		String sent;
		System.out.println("enter your sentence");
		Scanner sc=new Scanner(System.in);
		sent=sc.nextLine();
		String[] s=sent.split(" ");
		
		for(String ss:s)
		{
			System.out.println(ss);
		}
		
	}

}
