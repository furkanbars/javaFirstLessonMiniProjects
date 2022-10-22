package miniProjectIsThereNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5,6,8,15,156,487,978};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("SAYI BİZDE MEVCUT MU?");
		System.out.print("Lütfen aramak istediğiniz numarayı yazınız: ");
		int number = scanner.nextInt();
		
		boolean haveWe = false;
		
		for(int myNumber : numbers) {
			if(myNumber == number) {
				haveWe = true;
				break;
			}
		}
		
		if (haveWe) {
			System.out.println("Sayı bizde mevcut.");
		}else {
			System.out.println("Maalesef sayı bizde mevcut değil.");
		}
	}
}
