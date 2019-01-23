
import java.util.Arrays;
import java.util.Scanner;


public class Program28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter first array size");
		int n1=0;
		int n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		int[] a1=new int[n1];
		System.out.println("enter first array elements");
		for(int i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("enter second array size");
		n2=sc.nextInt();
		int[] a2=new int[n2];
		System.out.println("enter second array elements");
		for(int i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		Arrays.sort(a1);
		Arrays.sort(a2);
		int j=0;
		int[] a3=new int[n1+n2];
		for(int i=0;i<n2+n1;i++)
		{
			if(i<n1)
			{
			a3[i]=a1[i];
			}
			else
			{
				a3[i]=a2[j];
				j++;
			}
		}
		Arrays.sort(a3);
		
		int med=0;
		if(a3.length%2==0)
		{
			med=a3.length/2;
		}
		else
		{
			med=(a3.length/2)+1;
			
		}
		System.out.println("output="+a3[med-1]);
		

	}

}
