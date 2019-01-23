import java.util.Arrays;
import java.util.Scanner;

public class Program8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your elements");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
	Arrays.sort(arr);
	System.out.println(arr[1]);
	}

}
