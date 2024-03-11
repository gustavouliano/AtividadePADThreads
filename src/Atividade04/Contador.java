package Atividade04;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Contador implements Runnable {

	public static final int ESTADO_CONTAR = 1;
	public static final int ESTADO_PAUSAR = 2;
	public static final int ESTADO_PARAR  = 3;
	
	JButton startButton;
	JButton pauseButton;
	JButton stopButton;
	JLabel label;
	
	int estado = ESTADO_PAUSAR;
	int count = 0;

	public Contador(JButton startButton, JButton pauseButton, JButton stopButton, JLabel label) {
		this.startButton = startButton;
		this.pauseButton = pauseButton;
		this.stopButton = stopButton;
		this.label = label;
		
		this.config();
		new Thread(this).start();
	}
	
	/**
	 * Define os métodos dos botões e fonte do label
	 */
	public void config() {
		this.label.setFont(new Font("Arial", Font.BOLD, 24));
		this.startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciaContagem();
			}
		});
		this.pauseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pausarContagem();
			}
		});
		
		this.stopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pararContagem();
			}
		});
	}

	/**
	 * Altera o estado do contador para contar
	 */
	public void iniciaContagem() {
		System.out.println("Método inicia contagem");
		estado = ESTADO_CONTAR;
	}

	/**
	 * Altera o estado do contador para pausar
	 */
	public void pausarContagem() {
		System.out.println("Método pausar contagem");
		estado = ESTADO_PAUSAR;
	}
	
	/**
	 * Altera o estado do contador para parar
	 */
	public void pararContagem() {
		System.out.println("Método parar contagem");
		estado = ESTADO_PARAR;
	}

	@Override
	public void run() {
		while (true) {
//			Thread.currentThread();
//			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (estado == ESTADO_CONTAR) {
				count++;
                this.label.setText(String.valueOf(count));
			}
			else if (estado == ESTADO_PARAR) {
				count = 0;
				this.label.setText(String.valueOf(count));
			}

		}
	}

}
