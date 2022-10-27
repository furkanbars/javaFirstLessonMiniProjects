package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------------------GİRİLEN SAYI ELİMİZDE VAR MI?---------------------");
		System.out.print("Lütfen sayıyı giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		findNumber(number);
	}
	
	public static void findNumber(int number) {
		int[] numbers= {1,5,9,156,654,41567,1234,456,4589};
		boolean haveWe = false;
		
		for(int i=0;i<numbers.length;i++) {
			if(number==numbers[i]) {
				haveWe=true;
				break;
			}
		}
		
		if(haveWe) {
			System.out.println("Sayı elimizde mevcut.");
		}else {
			System.out.println("Maalesef sayı elimizde mevcut değil.");
		}
	}
}
