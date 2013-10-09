package br.financeiro.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TelaLogin extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 526379345239806752L;
	
	private JLabel usuario, senha;
	private JTextField jtUsuario;
	private JPasswordField jpSenha;
	private JButton logar, cancelar;
	
	public TelaLogin() {
		super("Login");
		
		this.initJlabel();
		this.initJtext();
		
		int width = jtUsuario.getX()+jtUsuario.getWidth()+20;
		int height = jpSenha.getY()+jpSenha.getHeight()+10+20+20;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		
		this.initJbutton();
		
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	private void initJlabel(){
		usuario = new JLabel("Usuário");
		senha = new JLabel("Senha");
		
		int x = 20;
		int y = 20;
		int width = 100;
		int height = 20;
		
		usuario.setBounds(x, y, width, height);
		
		y = usuario.getY()+height+10;
		
		senha.setBounds(x, y, width, height);
		
		this.addComponents(usuario, senha);
	}
	
	private void initJtext(){
		jtUsuario = new JTextField();
		jpSenha = new JPasswordField();
		
		int x = usuario.getX()+usuario.getWidth()+10;
		int y = 20;
		int width = 150;
		int height = 20;
		
		jtUsuario.setBounds(x, y, width, height);
		
		y = senha.getY();
		
		jpSenha.setBounds(x, y, width, height);
		
		this.addComponents(jtUsuario, jpSenha);
	}
	
	private void initJbutton(){
		logar = new JButton("Logar");
		cancelar = new JButton("Cancelar");
		
		int width = 100;
		int height = 20;
		
		int x = (this.getWidth()/2)-width-5;
		int y = this.getHeight()-height-20;
		
		logar.setBounds(x, y, width, height);
		
		x = (this.getWidth()/2)+5;
		
		cancelar.setBounds(x, y, width, height);
		
		this.addComponents(logar, cancelar);
	}
	
	private void addComponents(JComponent...components){
		for (int i = 0; i < components.length; i++) {
			if (components[i] instanceof JButton) {
				JButton b = (JButton) components[i];
				b.addActionListener(this);
				this.add(b);
			}
			this.add(components[i]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == logar) {
			String senha = String.valueOf(jpSenha.getPassword());
			JOptionPane.showMessageDialog(null, senha);
		}else if(e.getSource() == cancelar){
			
		}
	}
	
	public static void main(String[] args) {
		new TelaLogin();
	}
	
}
