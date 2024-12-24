package srinath;

import java.util.Scanner;
public class primenumber {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the range (1 to 300):");
		        int range = scanner.nextInt();

		        int count = 0;
		        int num = 2;

		        while (count < 17) {
		            if (isPrime(num)) {
		                System.out.println(num + " is a prime number");
		                count++;
		            }
		            num++;
		        }
		    }

		    public static boolean isPrime(int n) {
		        if (n <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
}
