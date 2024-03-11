package Atividade02;

public class main {

	public static void main(String[] args) {
		
		int qtd_thread = 3;
		
		for(int i = 0; i < qtd_thread; i++) {
			new Contador(50);
		}
		
	}

}
