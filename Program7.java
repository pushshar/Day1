import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the number of series");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<=n;i++)
		{
			if(i<3)
			{
			System.out.println(a+" ");
			System.out.println(b+" ");
			}
			else
			{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			}
		}

	}

}
