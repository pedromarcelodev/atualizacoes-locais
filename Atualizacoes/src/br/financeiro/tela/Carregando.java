package br.financeiro.tela;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Carregando extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel imagem;
	
	public Carregando() {
		super("Carregando");
		
		imagem = new JLabel();
		imagem.setBounds(0, 0, 40, 40);
		imagem.setIcon(new ImageIcon(getClass().getResource("carregando.gif")));
		
		this.add(imagem);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Carregando();
	}

}
