import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		name=sc.next().toUpperCase();
		char[] ch=name.toCharArray();
		int num=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A'||ch[i]=='I'||ch[i]=='J'||ch[i]=='Q'||ch[i]=='Y')
			{
				num=num+1;
			}
			else if(ch[i]=='B'||ch[i]=='K'||ch[i]=='R')
			{
				num=num+2;
			}
			else if(ch[i]=='C'||ch[i]=='G'||ch[i]=='L'||ch[i]=='S')
			{
				num=num+3;
			}
			else if(ch[i]=='D'||ch[i]=='M'||ch[i]=='T')
			{
				num=num+4;
			}
			else if(ch[i]=='E'||ch[i]=='H'||ch[i]=='N'||ch[i]=='X')
			{
				num=num+5;
			}
			else if(ch[i]=='U'||ch[i]=='V'||ch[i]=='W')
			{
				num=num+6;
			}
			else if(ch[i]=='O'||ch[i]=='Z')
			{
				num=num+7;
			}
			else if(ch[i]=='F'||ch[i]=='P')
			{
				num=num+8;
			}
		}
		int n=num;
		int sum=0;
		while(num!=0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("your output is :"+sum);
	}

}
