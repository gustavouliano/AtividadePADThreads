package Atividade02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um valor maior que 5000: ");
		int valor = input.nextInt();
		input.close();
		
		int qtd_thread = 10;
		for(int i = 0; i < qtd_thread; i++) {
			new Contador(valor);
		}
		
	}

}
