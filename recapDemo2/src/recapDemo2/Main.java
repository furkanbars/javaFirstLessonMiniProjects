package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] numbers = {0.5,1.9,7.5,16.2,3.5};
		
		for(double number:numbers) {
			System.out.println(number);
		}
		
		System.out.println("--------------------------------");
		System.out.println("Toplam");
		
		double total = 0;
		
		for(double number:numbers) {
			total = total + number;
		}
		System.out.println("Sayıların toplamı: " + total);
		
		System.out.println("--------------------------------");
		System.out.println("En büyük");
		
		double max = numbers[0];
		
		for(double number:numbers) {
			if(max<number) {
				max = number;
			}
		}
		
		System.out.println("En büyük sayı: " + max);
		
		System.out.println("--------------------------------");
		System.out.println("En küçük");
		
		double min = numbers[0];
		
		for(double number:numbers) {
			if(number<min) {
				min = number;
			}
		}
		
		System.out.println("En küçük sayı: "+min);
	}
}
