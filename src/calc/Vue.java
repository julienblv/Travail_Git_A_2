package calc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vue 
{
	public static void main(String[] args)
	{
		//------------JFrame------------------------------------
		JFrame calculette = new JFrame();
		calculette.setTitle("Calculette");
		calculette.setSize(1000,500);
		calculette.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//JPanel
		JPanel panelNum =new JPanel();
		
		//-----------JtextFields--------------------------------
		JTextField champDeSaisie = new JTextField(30);
		champDeSaisie.setColumns(10); 
		champDeSaisie.setBounds(50,1000, 200, 30);
		panelNum.add(champDeSaisie);
		
		calculette.add(panelNum);
		calculette.setVisible(true);
	}
	
}
