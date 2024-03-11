package Atividade04;

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

        // Botões e label do A
        JButton startButtonA = new JButton("Start A");
        JButton pauseButtonA = new JButton("Pause A");
        JButton stopButtonA = new JButton("Stop A");
        JLabel labelNumeroA = new JLabel("0");
        
        // Botões e label do B
        JButton startButtonB = new JButton("Start B");
        JButton pauseButtonB = new JButton("Pause B");
        JButton stopButtonB = new JButton("Stop B");
        JLabel labelNumeroB = new JLabel("0");
        
        Contador contador = new Contador(startButtonA, pauseButtonA, stopButtonA, labelNumeroA);
        Contador contador2 = new Contador(startButtonB, pauseButtonB, stopButtonB, labelNumeroB);
        
        
        // Add componentes 1° linha
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 0, 10);
        
        gbc.weightx = 1; // Distribui o espaço horizontalmente
        panel.add(startButtonA, gbc);

        gbc.gridx = 1;
        panel.add(pauseButtonA, gbc);

        gbc.gridx = 2;
        panel.add(stopButtonA, gbc);

        gbc.gridx = 3;
        gbc.insets = new Insets(0, 10, 0, 0);
        panel.add(labelNumeroA, gbc);

        gbc.gridy = 2; // Espaçamento
        gbc.gridx = 0;
        gbc.insets = new Insets(20, 10, 0, 10); // Espaçamento no topo
        panel.add(startButtonB, gbc);

        gbc.gridx = 1;
        panel.add(pauseButtonB, gbc);

        gbc.gridx = 2;
        panel.add(stopButtonB, gbc);

        gbc.gridx = 3;
        gbc.insets = new Insets(20, 10, 0, 0); // Espaçamento no topo
        panel.add(labelNumeroB, gbc);
        
        // Adicionando o painel à Janela
        frame.add(panel);

        // Visibilidade da janela
        frame.setVisible(true);
    }
}
