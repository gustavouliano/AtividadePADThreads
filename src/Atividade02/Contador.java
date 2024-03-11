package Atividade02;

public class Contador extends Thread {

	private int valor;
	public static int contador = 0;
	
	public Contador(int valor) {
		this.valor = valor;
		this.start();
	}
	
	public void run() {
        while (contador <= valor) {
            System.out.println(Thread.currentThread().getName() + " número " + contador++);
        }
    }
	
}
