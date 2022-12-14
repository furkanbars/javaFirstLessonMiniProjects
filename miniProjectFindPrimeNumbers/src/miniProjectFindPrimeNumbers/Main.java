package miniProjectFindPrimeNumbers;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen sayıyı giriniz: ");
		int number = scanner.nextInt();
		isPrimeNumber(number);
	}
	
	static boolean findPrimeNumber(int number) {
		boolean result = false;
		
		if(number==1) {
			return result=true;
		}
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				result=true;
				break;
			}
		}
		return result;
	}
	
	static void isPrimeNumber(int number) {
		if(number<1) {
			System.out.println("Geçersiz sayı!");
		}
		else if(findPrimeNumber(number)) {
			System.out.println("Sayı asal değil.");
		}else {
			System.out.println("Sayı asal bir sayıdır.");
		}
	}
}


