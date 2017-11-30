import java.util.Scanner;

public class TriangleRight {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Integer num for display star pattern ");
		int n=scan.nextInt();
		int i,j,k=n;
		for (i=1; i<=n; i++)
		{
			
			for (j=1; j<=k; j++)
			{
				System.out.print(" ");
			}
			k=k-1;
			for ( j=1; j<=i; j++) 
			{
			System.out.print("*");
			}
			
			System.out.println("");
		 
		} 
	}

}
