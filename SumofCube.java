package New_folder;
import java.util.*;

public class SumofCube {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any mumber:");
		int a = sc.nextInt();
		int sum=0,n;
		while(a!=0)
		{
			n=a%10;
			sum = sum +(n*n*n);
			a=a/10;
		}
System.out.println(sum);
	}

}
