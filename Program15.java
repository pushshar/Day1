import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num=n;
		int r;
		int sum=1;
		int ans=0;
		while(num!=0)
		{
			r=num%10;
			sum=1;
			for(int i=1;i<=r;i++)
			{
				sum=sum*i;
			}
			ans=ans+sum;
			num=num/10;
		}
        if(ans==n)
        {
        	System.out.println("it is a strong number");
        }
	}

}
