package Atividade05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {

    public static void main(String[] args) {
    	
        // JANELA
    	Frame frame = new JFrame("Contadores"); 
        ((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Saída da aplicação
        frame.setSize(450, 200); // Dimensões da janela

        // PAINEL
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Botões e label
        JButton incrementaButton = new JButton("Incrementar");
        JButton decrementaButton = new JButton("Decrementar");
        JLabel label = new JLabel("0");
        label.setFont(new Font("Arial", Font.BOLD, 30));

        Contagem inc = new Contagem(incrementaButton, label, false);
        Contagem dec = new Contagem(decrementaButton, label, true);
        
        new Thread(inc).start();
        new Thread(dec).start();
        
        incrementaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				synchronized (incrementaButton) {
					incrementaButton.notify();
				}
			}
		});
        
        decrementaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				synchronized (decrementaButton) {
					decrementaButton.notify();
				}
			}
		});
        
        // Add componentes 1° linha
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 0, 0);
        
        gbc.weightx = 1; // Distribui o espaço horizontalmente
        panel.add(incrementaButton, gbc);
        
        gbc.gridx = 1;
        gbc.insets = new Insets(40, 0, 0, 100);
        panel.add(label, gbc);

        gbc.gridy = 2; // Espaçamento
        gbc.gridx = 0;
        gbc.insets = new Insets(0, 0, 0, 0); // Espaçamento no topo
        panel.add(decrementaButton, gbc);
        
        gbc.gridx = 3;
        gbc.insets = new Insets(10, 10, 0, 0); // Espaçamento no topo
        
        // Adicionando o painel à Janela
        frame.add(panel);

        // Visibilidade da janela
        frame.setVisible(true);
    }
}
