import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number for prime factorisation ");
		num=sc.nextInt();
		if(num<=1)
		{
			System.out.println("Not possible");
			
		}
		else
		{
		for(int i=2;i<=num;i++)
		{
			
			while(num%i==0)
			{
				num=num/i;
				System.out.print(i+" ,");
			}
			
			
		}
	
	}
	}
}
