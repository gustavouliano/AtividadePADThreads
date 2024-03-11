package Atividade03;

public class Semaforo implements Runnable {
	
	private boolean aberto = false;
	public Controlador controlador;
//	private String nome;
	
	public Semaforo() {
//		this.controlador = controlador;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	@Override
	public void run() {

		new Thread(this.controlador).start();
//		System.out.println("E");
		while (true) {
			synchronized (controlador) {
				try {
	//				System.out.println("C");
					controlador.wait();
	//				System.out.println("D");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	//			System.out.println("Semáforo " + Thread.currentThread().getName() + " aberto.");
				this.setAberto(true);
				try {
					controlador.imprimeSemaforos();
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.setAberto(false);
	//			System.out.println("Semáforo " + Thread.currentThread().getName() + " fechado.");
			}
		}
		
	}
}
