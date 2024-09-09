package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma string para ser invertida: ");
		String input = sc.nextLine();
		
		String stringInvertida = inverterString(input);
		System.out.println("String invertida: " + stringInvertida);
		
		sc.close();
	}
	
	public static String inverterString(String str) {
		char[] caract = str.toCharArray();
		int comprimento = caract.length;
		
		for (int i=0; i<comprimento / 2; i++) {
			char temp = caract[i];
			caract[i] = caract[comprimento - 1 - i];
			caract[comprimento - 1 - i] = temp;
		}
		
		return new String(caract);
	}

}
