package miniProjectPerfectNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("SAYI MÜKEMMEL SAYI MI?");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = scanner.nextInt();
		int sum = 1;
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				sum = sum + i;
			}
		}
		
		if(sum == number) {
			System.out.println("Sayı mükemmel bir sayıdır.");
		}else {
			System.out.println("Sayı mükemmel sayı değildir.");
		}
	}
}
