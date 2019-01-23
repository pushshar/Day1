import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=0;
		for(int i=1;i<=100;i++)
		{
			num=i;
			sum=0;
			for(int j=1;j<i;j++)
			{
			if(i%j==0)
			{
				sum=sum+j;
			}
			
			}
			if(sum==i)
			{
				System.out.println(" "+i);
			}
		}
	
	
	}
}
