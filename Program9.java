import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string for finding first non - repeating character");
		int[] count=new int[26];
		str=sc.next().toLowerCase().toCharArray();
		for(int i=0;i<str.length;i++)
		{
			count[((int)str[i]-97)]=count[((int)str[i]-97)]+1;
		}
		for(int i=0;i<str.length;i++)
		{
			if(count[((int)str[i]-97)]==1)
			{
				System.out.println(str[i]+" ");
				break;
			}
		}

	}

}
