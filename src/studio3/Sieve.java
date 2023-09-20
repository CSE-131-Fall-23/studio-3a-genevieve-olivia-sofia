package studio3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a number");
		int n = in.nextInt();
		boolean[] array = new boolean[n + 1];
		
		for (int i = 2; i < array.length; i++) {
			array[i] = true;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (array[i] == true) {
				for (int j = (int) Math.pow(i, 2); j < n+1; j = j+1) {
					array[j] = false;
				}
			}
			
		}
	
		for (int i = 0; i < array.length; i++) {
			if (array[i] == true) {
				System.out.println(i);
				
			}
		}
	}

}
