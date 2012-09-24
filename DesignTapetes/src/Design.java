import java.awt.*;
import javax.swing.*;



public class Design extends JFrame {
	
	public Design () {		
		setTitle ("Design Tapetes");
		setSize (700, 700);		
		Container cp = getContentPane ();		
		JTabbedPane jtp = new JTabbedPane ();
		cp.add (jtp);		
		
		JPanel cliente = new JPanel ();	
		JPanel pedido = new JPanel ();
		JPanel preco = new JPanel ();
		JLabel nome = new JLabel ("Nome:");
		JLabel sobrenome = new JLabel ("Sobrenome:");
		JLabel cpf = new JLabel ("CPF:");
		
		JTextField camponome = new JTextField ();
		JTextField camposobrenome = new JTextField ();
		JTextField campocpf = new JTextField ();		
		
		JButton incluir = new JButton ("Incluir");
		JButton atualizar = new JButton ("Atualizar");
		JButton listar = new JButton ("Listar");
		JButton excluir = new JButton ("Excluir");		
		
		String [] colunas = {"CPF", "Nome", "Sobrenome"};
		
		String [][] dados = {
								{"Teste", "Teste", "Teste"},
								{"Teste", "Teste", "Teste"},
								{"Teste", "Teste", "Teste"}
							};
		
		JTable tabela = new JTable (dados, colunas);
		
		tabela.setSize (300, 200);		
		
		cliente.setLayout (null);
		
		nome.setBounds (10, 10, 100, 10);		
		cliente.add (nome);	
		
		sobrenome.setBounds (10, 40, 100, 10);
		cliente.add (sobrenome);
		
		cpf.setBounds (10, 70, 100, 10);
		cliente.add (cpf);		
		
		camponome.setBounds (110, 8, 500, 20);
		cliente.add (camponome);
	
		camposobrenome.setBounds (110, 37, 500, 20);
		cliente.add (camposobrenome);
		
		campocpf.setBounds (110, 65, 500, 20);
		cliente.add (campocpf);			
		
		incluir.setBounds (191, 150, 100, 30);
		cliente.add (incluir);
				
		atualizar.setBounds (296, 150, 100, 30);
		cliente.add (atualizar);
		
		listar.setBounds (401, 150, 100, 30);
		cliente.add (listar);
		
		excluir.setBounds (506, 150, 100, 30);
		cliente.add (excluir);		
		
		tabela.setLocation (200, 400);
		cliente.add (tabela);		
		
		jtp.addTab ("Cliente", cliente);		
		
		jtp.addTab ("Pedido", pedido);			
		
		jtp.addTab ("Preço do Material", preco);		
	}
	/*
	public static void main (String [] args) {		
		Design design = new Design ();
		design.setVisible (true);
	}
}*/