package tella_p1;

import java.util.Scanner;


public class Tella_p1 {
	
	public static int []Encrypt(int M[])
	{
		int n = M.length;
		int N[] = new int[M.length];
		
		
		for(int i = 0; i < M.length; i++) {
		
			N[i]=M[i];
			
		}
		
		
		for(int i = 0; i < n; i++) {
		
			N[i]= (N[i] + 7)%10;
			
		}

		int temp;
		
		temp = N[0];
		
		N[0] = N[2];
		
		N[2] = temp;

		temp = N[1];
		
		N[1] = N[3];
		N[3] = temp;
		return N;
	}
	
	
	public static int []Decrypt(int M[]) {
		
		int N[] = new int[M.length];
		
		for(int i = 0; i < M.length; i++) {
			N[i] = M[i];
		}
		
		int n = M.length;
		
		for(int i = 0; i < n; i++) {
			
			if((N[i] - 7)<= 0)
				N[i] = N[i] + 10;
	}
		for(int i = 0; i < 4; i++) {

			N[i] = (N[i]-7)%10;
			
		}

		int temp;
		temp = N[0];
		N[0] = N[2];
		N[2] = temp;

		temp = N[1];
		N[1] = N[3];
		N[3] = temp;
		
		return N;
	}
	
	
	public static String Print(int M[])
	{
		for(int i = 0; i < 4; i++) {

			System.out.print(M[i]);

		}
		
		System.out.println();
		
		return "";
	}
  
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any 4 digit Number : ");
		
		
		int N = Integer.parseInt(sc.nextLine());
		
		int M[] = new int[4];
		
		
		for(int i=0; i<4; i++) {
		
			M[3-i] = N%10;
			N = N/10;
			
		}
		
		Print(M);
		
		System.out.println("Encryption Complete :");
		
		Print(Encrypt(M));
		
		System.out.println("Decryption Complete : ");
		
		Print(Decrypt(Encrypt(M)));
	}
}


