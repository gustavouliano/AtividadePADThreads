package Atividade05;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Contagem implements Runnable {

	JButton button;
	JLabel label;

	boolean decrementar = false;

	public Contagem(JButton button, JLabel label, boolean decrementar) {
		this.button = button;
		this.label = label;
		this.decrementar = decrementar;
	}

	@Override
	public void run() {
		synchronized (button) {
			try {
				button.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Random random = new Random();
			while (true) {
				int value = random.nextInt(5);
				if (this.decrementar) {
					label.setText(String.valueOf(Integer.valueOf(label.getText()) - value));
				}
				else {
					label.setText(String.valueOf(Integer.valueOf(label.getText()) + value));
				}
				Thread.currentThread();
				Thread.yield();
			}
		}
	}

}
