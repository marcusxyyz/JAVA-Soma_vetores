package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will each vector have? ");
		int n = sc.nextInt();
		
		double[] vectA = new double[n];
		double[] vectB = new double[n];
		
		System.out.println("Input the values of vector A: ");
		for(int i=0; i < vectA.length; i++) {
			vectA[i] = sc.nextDouble();
		}
		
		System.out.println("Input the values of vector B: ");
		for(int i=0; i < vectB.length; i++) {
			vectB[i] = sc.nextDouble();
		}
		
		double[] sum = new double[n];
		for(int i=0; i<sum.length; i++) {
			sum[i] = vectA[i] + vectB[i];
		}
		
		System.out.println();
		System.out.println("RESULTING VECTOR:");
		for(int i =0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
		
		
		sc.close();
	}

}
