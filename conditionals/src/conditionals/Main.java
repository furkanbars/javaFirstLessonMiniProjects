package conditionals;

public class Main {

	public static void main(String[] args) {
		int number = 14;
		
		if(number>15) {
			System.out.println("Sayı 15'ten büyük.");
		}else if(number == 15){
			System.out.println("Sayı 15'e eşit.");
		}else if(number<15){
			System.out.println("Sayı 15'ten küçük.");
		}else {
			System.out.println("Bir şeyler ters gitti.");
		}
	}
}
