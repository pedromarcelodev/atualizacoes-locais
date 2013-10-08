package br.financeiro.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastrarGasto extends JFrame implements ActionListener {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5948060725914617672L;
	
	private JLabel titulo, valor, descricao;
	private JTextField jtTitulo, jtValor;
	private JTextArea jtaDescricao;
	private JButton salvar, cancelar;
	
	public CadastrarGasto() {
		super("Cadastro de gastos");
		
		this.initJlabel();
		this.initJtext();
		
		int width = jtTitulo.getX()+jtTitulo.getWidth()+20;
		int height = jtaDescricao.getY()+jtaDescricao.getHeight()+40;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	private void initJlabel(){
		titulo = new JLabel("Título");
		valor = new JLabel("Valor");
		descricao = new JLabel("Descrição");
		
		int x = 20;
		int width = 60;
		int height = 20;
		
		titulo.setBounds(x, 20, width, height);
		int y = titulo.getY()+titulo.getHeight()+10;
		
		valor.setBounds(x, y, width, height);
		y = valor.getY()+valor.getHeight()+10;
		
		descricao.setBounds(x, y, width, height);
		
		this.addComponents(titulo, valor, descricao);
	}
	
	private void initJtext(){
		jtTitulo = new JTextField();
		jtValor = new JTextField();
		jtaDescricao = new JTextArea();
		
		int width = 200;
		int height = 20;
		int x = titulo.getX()+titulo.getWidth()+10;
		int y = titulo.getY();
		
		jtTitulo.setBounds(x, y, width, height);
		
		y = valor.getY();
		jtValor.setBounds(x, y, 100, height);
		
		y = descricao.getY();
		jtaDescricao.setBounds(x, y, width, 60);
		jtaDescricao.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		this.addComponents(jtTitulo, jtValor, jtaDescricao);
	}
	
	private void addComponents(JComponent...components){
		for (int i = 0; i < components.length; i++) {
			if (components[i] instanceof JButton) {
				JButton b = (JButton) components[i];
				b.addActionListener(this);
				this.add(b);
			} else {
				this.add(components[i]);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		new CadastrarGasto();
	}

}
