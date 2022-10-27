package miniProjectHowIsTheLetter;

import java.util.Scanner;

//a,ı,o,u = kalın
//e,i,ö,ü = ince

public class Main {
	static char[] convertToChar(String expression) {
		char[] characters = new char[expression.length()];
		expression.getChars(0, expression.length(), characters, 0);
		return characters;
	}
	
	static void giveBold(char[] characters) {
		System.out.println("Kalın sesli harfler şunlardır: ");
		
		for(char character:characters) {
			switch (character) {
			case 'A':
			case 'a':
				System.out.print(character+" ");
				break;
			case 'I':
			case 'ı':
				System.out.print(character+" ");
				break;
			case 'O':
			case 'o':
				System.out.print(character+" ");
				break;
			case 'U':
			case 'u':
				System.out.print(character+" ");;
				break;
			default:
				break;
			}
		}
		System.out.println();
	}
	
	static void giveSlim(char[] characters) {
		System.out.println("İnce sesli harfler şunlardır : ");

		for(char character:characters) {
			switch (character) {
			case 'E':
			case 'e':
				System.out.print(character+" ");
				break;
			case 'İ':
			case 'i':
				System.out.print(character+" ");
				break;
			case 'Ö':
			case 'ö':
				System.out.print(character+" ");
				break;
			case 'Ü':
			case 'ü':
				System.out.print(character+" ");
				break;
			default:
				break;
			}
		}
		System.out.println();
	}
	
	static void giveMeBoldAndSlimCharacters(String expression){
		char[] allCharacters = convertToChar(expression);
		giveBold(allCharacters);
		giveSlim(allCharacters);
	}
	
	public static void main(String[] args) {
		System.out.print("Lütfen ifadeyi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.nextLine();
		giveMeBoldAndSlimCharacters(expression);
	}
}
