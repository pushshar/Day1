
import java.util.Arrays;
import java.util.Scanner;

public class Program20 {

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
		int greater=0;
		String temp;
		int index=0;
		int ind=0;
		for(int i=0;i<c.length;i++)
		{
			if(i==c.length-1)
			{
				temp=new String(c);
				len=(temp.substring(f, i+1)).length();
				
				
				if(greater<len)
				{
					index=i;
					ind=f;
					greater=len;
				}
				break;
			}
			if(c[i]!=c[i+1])
			{
				
				temp=new String(c);
				len=(temp.substring(f, i+1)).length();
				
				
				if(greater<len)
				{
					index=i;
					ind=f;
					greater=len;
				}
				f=i+1;
				
				
			}
			
		}
		System.out.println("longest occurence character is "+c[index]+" and length is "+greater+" at index "+ind);
		
		}
	}


