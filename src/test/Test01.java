package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1 = 0, n2 = 1, total = 0;
		
		System.out.println("digite um numero: ");
		int a = teclado.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		while (total < a) {			
			int soma = n1 + n2;
			System.out.println(soma);
			n1 = n2;
			n2 = soma;
			total = soma;
		}
		if(a == n2) {
			System.out.println("o numero existe na sequencia");
		} else {
			System.out.println("o numero NÃO existe na sequencia");
			
		}
	}

}
