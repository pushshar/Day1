import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		LinkedHashSet<String> t=new LinkedHashSet<String>();
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String[] words=s.split(" ");
        for(String i:words)
        	t.add(i);
        String a="";
        for(String i:t)
        	a=a+i+" ";
		
        System.out.println(a);
	}

}
