package reCapDemoClasses;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void doProscess() {

		System.out.print("Lütfen yapacağınız işlemi yazınız: ");
		int stuation = scanner.nextInt();

		Mathematic mathematic = new Mathematic();
		
		if(stuation>5) {
			System.out.println("Yanlış seçenek.");
			return;
		}

		while (!(stuation == 5)) {
			System.out.print("Lütfen ilk sayıyı giriniz: ");
			int number1 = scanner.nextInt();
			System.out.print("Lütfen ikinci sayıyı giriniz: ");
			int number2 = scanner.nextInt();
			if (stuation == 1) {
				System.out.println("Sonuç :" + mathematic.sum(number1, number2));
				doProscess();
			} else if (stuation == 2) {
				System.out.println("Sonuç :" + mathematic.sub(number1, number2));
				doProscess();
			} else if (stuation == 3) {
				System.out.println("Sonuç :" + mathematic.mult(number1, number2));
				doProscess();
			} else if (stuation == 4) {
				System.out.println("Sonuç :" + mathematic.div(number1, number2));
				doProscess();
			}else {
				break;
			}
		}
		System.out.println("Teşekkürler.");
	}

	public static void main(String[] args) {
		System.out.println("*****Dört işlem*****");
		System.out.println("Yapabileceğiniz işlemler: ");
		System.out.println("Toplama: 1");
		System.out.println("Çıkarma: 2");
		System.out.println("Çarpma: 3");
		System.out.println("Bölme: 4");
		System.out.println("Çıkış: 5");

		doProscess();
	}
}
