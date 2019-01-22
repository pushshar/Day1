import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num=n;
		int flag=0;
		for(int i=1;i<n;i++)
		{
			if(Math.pow(5, i)==n)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
