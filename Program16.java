import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		int num;
		int r;
		int sum=0;
		int len;
		for(int i=1;i<=1000;i++)
		{
			sum=0;
			len=Integer.toString(i).length();
			num=i;
			while(num!=0)
			{
				r=num%10;
				sum=sum+ (int) (Math.pow(r, len));
				num=num/10;
			}
			if(i==sum)
			{
				System.out.print(" "+i);
			}
			
		}

	}

}
