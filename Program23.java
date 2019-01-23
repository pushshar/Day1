import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string for finding first non - repeating character");
		int[] count=new int[26];
		name=sc.nextLine().toLowerCase();
		String[] grp=name.split(" ");
		for(String str:grp)
		{
		for(int i=0;i<str.length();i++)
		{
			count[((int)str.charAt(i)-97)]=count[((int)str.charAt(i)-97)]+1;
		}
		for(int i=0;i<str.length();i++)
		{
			if(count[((int)str.charAt(i)-97)]==1)
			{
				System.out.println(str.charAt(i)+",");
				break;
			}
		}
		for(int i=0;i<26;i++)
		{
			count[i]=0;
		}

	}
	}
}
