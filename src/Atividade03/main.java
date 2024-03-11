package Atividade03;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Semaforo> semaforos = new ArrayList<Semaforo>();
		
		for(int i = 0; i < 4; i++) {
			semaforos.add(new Semaforo());
		}
		
		Controlador controlador = new Controlador(semaforos);
		for(int i = 0; i < 4; i++) {
			semaforos.get(i).controlador = controlador;
			new Thread(semaforos.get(i)).start();
		}
	}

}
