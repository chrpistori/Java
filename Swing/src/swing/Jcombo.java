package swing;

import javax.swing.*;
import java.awt.*;

public class Jcombo extends JFrame{

		//Declara variável tipo ComboBox
		private JComboBox objCombo;

		//Array de strings para popular a combo
		private String[] itens = { "Selecione", "Branco" , "Vermelho" , "Verde" , "Azul" };
	
		//Construtor da classe
		public Jcombo () {
		//Titulo da janela
		setTitle ("Exemplo de JComboBox");

		//Dimensões da janela
		setSize (200, 150);

		//Instancia da combo já passando o array
		objCombo = new JComboBox(itens);

		//classe abstrata container
		Container cnt = getContentPane();
		cnt.add(objCombo);
		cnt.setLayout( new FlowLayout() );
		}

		//metodo de execução
		public static void main (String args[]) {

		// exibe a combo na janela
		new Jcombo().setVisible(true);
		}
	}
