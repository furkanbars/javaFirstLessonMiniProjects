package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'h';

		switch (grade) {
		case 'A', 'a':
			System.out.println("Mükemmel : Geçtiniz.");
			break;
		case 'B','b':
			System.out.println("Çok iyi : Geçtiniz.");
			break;
		case 'C','c':
			System.out.println("İyi : Geçtiniz.");
			break;
		case 'D','d':
			System.out.println("Geçtiniz.");
			break;
		case 'F','f':
			System.out.println("Maalesef kaldınız.");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
			
		}
	}
}
