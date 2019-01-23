import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		
		int v;
		for(int i=0;i<4;i++)
		{
			
			v=(int) Math.pow(11,i);
			System.out.println(v);
			
			
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your x coordinate");
		int x=sc.nextInt();
		System.out.println("enter your y coordinate");
		int y=sc.nextInt();
		int temp=0;
		
		for(int i=0;i<4;i++)
		{
			v=(int) Math.pow(11,i);
		
			if(x-1==i)
			{
				temp=v;
				break;
			}
			
			
		}
		
		String t=Integer.toString(temp);
		int r=t.length()-y;
		
		System.out.println(t.charAt(r));
		
	}

}
