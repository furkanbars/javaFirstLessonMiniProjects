package miniProjectAmicableNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("ARKADAŞ SAYILAR MI?");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ilk sayıyı giriniz: ");
		int number1 = scanner.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz: ");
		int number2 = scanner.nextInt();
		
		int sum1 = 1;
		int sum2 = 1;
		
		for(int i=2;i<number1;i++) {
			if(number1%i==0) {
				sum1 = sum1 + i;
			}
		}
		
		for(int j=2;j<number2;j++) {
			if(number2%j==0) {
				sum2 = sum2 + j;
			}
		}
		
		if(sum1 == number2 && sum2 == number1) {
			System.out.println("Sayı arkadaş sayılardır.");
		}else {
			System.out.println("Sayı arkadaş sayı değildir.");
		}
		
		
	}
}
