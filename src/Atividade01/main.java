package Atividade01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o número de corredores: ");
		int num_corredores = input.nextInt();
		
		
		ArrayList<Corredor> corredores = new ArrayList<Corredor>();
		int percurso = 30;
		
		for (int i = 1; i <= num_corredores; i++) {
			System.out.print("Digite o nome do corredor " + i + ": ");
			String nome = input.next();
			Corredor corredor = new Corredor(nome, percurso);
			corredores.add(corredor);
		}
		
		for(int i = 0; i < corredores.size(); i++) {
			new Thread(corredores.get(i)).start();
		}
	}

}
