package Atividade01;

import java.util.Random;

public class Corredor implements Runnable {
	public String nome;
	private int percorrido = 0;
	private int percurso;
	
	public Corredor(String nome, int percurso) {
		this.nome = nome;
		this.percurso = percurso;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		while(percorrido < percurso) {			
			int metros = random.nextInt(10) + 1;

			if ((metros + this.percorrido) > percurso) {
				metros = this.percurso - this.percorrido;
			}
			this.percorrido += metros;
			if (this.percorrido == this.percurso) {
				System.out.println("-> Corredor " + this.nome + " correu os últimos " + metros + " metros e chegou ao final!");
			}
			else {
				System.out.println(this.nome + " percorreu " + metros + " metros (Posição: " + percorrido + " metros).");
			}
			Thread.currentThread();
			Thread.yield();
		}

	}
	
	
}
