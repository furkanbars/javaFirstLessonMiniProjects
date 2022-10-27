package methods2;

public class Main {

	public static void main(String[] args) {
		int result = sum(5,5);
		System.out.println(result);
		update("Goddy");
		System.out.println(sum(1,5,7));
	}
	
	public static int sum(int number1,int number2) {
		return number1+number2;
	}
	public static int sum(int... numbers) {
		int sum=0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
	}
	public static void add(String item) {
		System.out.println(item+" sepete eklendi.");
	}
	public static void delete(String item) {
		System.out.println(item+" sepetten silindi.");
	}
	public static void update(String item) {
		System.out.println("Sepet güncellendi. "+item+" ürünü sepete eklendi");
	}
}
