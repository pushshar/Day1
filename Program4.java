import java.util.Scanner;

public class Program4 {
 
	public static void main(String[] args) {
		String s;
		System.out.println("enter your word");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char ch=s.charAt(0);
		int temp=0;
		int ans=0;
        for(int i=0;i<s.length();i++)
        {
        	ch=s.charAt(i);
        	if(ch>=65&&ch<=91)
        	{
        		temp=((int)ch-91);
        		temp=temp+26;
        		
        	}
        	else if(ch>=97&&ch<=122)
        	{
        		temp=((int)ch-122);
        		temp=temp+26;
        		
        	}

        	if(temp==0)
        		temp=1;
        	ans=ans+temp;
        }
        System.out.println(ans);
	}

}
