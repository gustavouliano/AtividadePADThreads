package Atividade02;

public class Soma {

	private int soma;
	
	public void somaValores(int valor) {
		soma = 0;
		while(soma < valor) {
			soma += 1;
			System.out.println(Thread.currentThread().getName() + " - número " + soma);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
