package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		int a = 0, b = 1, prox = 0;
		
		if (num == 0 || num == 1) {
			System.out.println("O número "+ num +" pertence à sequência de Fibonacci.");
		}
		else {
			while (prox < num) {
				prox = a + b;
				a = b;
				b = prox;
			}
			if (prox == num) {
				System.out.println("O número "+ num +" pertence à sequência de Fibonacci.");
			}
			else {
				System.out.println("O número "+ num +" NÃO pertence à sequência de Fibonacci.");
			}
		}
		
		sc.close();
	}

}
