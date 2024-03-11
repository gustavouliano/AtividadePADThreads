package Atividade03;

import java.util.ArrayList;
import java.util.Iterator;

public class Controlador implements Runnable {

	public ArrayList<Semaforo> semaforos;

	public Controlador(ArrayList<Semaforo> semaforos) {
		this.semaforos = semaforos;
	}

	public void run() {
		while (true) {
			try {
				Thread.currentThread();
				Thread.yield();
				Thread.sleep(1000);
				synchronized (this) {
					try {
						this.notify();
						Thread.yield();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				}

			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void imprimeSemaforos() {
		String msg = "";
		for (int i = 0; i < semaforos.size(); i++) {
			msg += "Semáforo " + i + " - " + semaforos.get(i).isAberto() + " | ";
		}
		
		System.out.println(msg);
	}

}
