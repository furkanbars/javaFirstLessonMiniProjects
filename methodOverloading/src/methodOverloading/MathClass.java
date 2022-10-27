package methodOverloading;

public class MathClass {
	public int sum(int number1,int number2) {
		return number1+number2;
	}
	public int sum(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum = sum + number;
		}
		return sum;
	}
}
