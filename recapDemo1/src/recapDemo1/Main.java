package recapDemo1;

public class Main {

	public static void main(String[] args) {
		// 4898975
		int[] numbers = {152,64,89,23,84,62,48,36,1546,4861635,4898975,5454,54,1,6553,12354};
		int biggestNumber = 0;
		int minimumNumber = 456456456;
		
		for (int i = 0; i < numbers.length; i++) {
			if(biggestNumber<numbers[i]) {
				biggestNumber = numbers[i];
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
		    if (numbers[i]<minimumNumber) {
				minimumNumber=numbers[i];
			}
		}
		
		System.out.println("Sayı dizisindeki en büyük sayı : " + biggestNumber);
		System.out.println("Sayı dizisindeki en küçük sayı : " + minimumNumber);
	}

}
