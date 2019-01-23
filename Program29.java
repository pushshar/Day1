
import java.util.Arrays;
import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char[] c=s.toCharArray();
		Arrays.sort(c);
		int len=0;
		int f=0;
		
		String temp;
		for(int i=0;i<c.length;i++)
		{
			if(i==c.length-1)
			{
				temp=new String(c);
				len=(temp.substring(f, i+1)).length();
				
				System.out.print(c[i]+"="+len);
				break;
			}
			if(c[i]!=c[i+1])
			{
				
				temp=new String(c);
				len=(temp.substring(f, i+1)).length();
				System.out.print(c[i]+"="+len+",");
				f=i+1;
				
				
			}
			//System.out.println(c[i]);
			
			
		}
		}
	}


