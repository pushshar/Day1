import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num=n;
		int c=0;
		while(num!=0)
		{
			c++;
			num=num/10;
		}
		if(Math.pow(10,(c-1))==n)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
