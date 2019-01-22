import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		String s;
		System.out.println("enter your sentence");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		StringBuffer ss=new StringBuffer(s);
		ss=ss.reverse();
		System.out.println(ss);

	}

}
