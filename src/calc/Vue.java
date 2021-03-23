package calc;

import javax.swing.JButton;
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
		calculette.setSize(500,500);
		calculette.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//JPanel
		JPanel pnl =new JPanel();
		
		//-----------JtextFields--------------------------------
		JTextField champDeSaisie = new JTextField(30);
		champDeSaisie.setColumns(35); 
		champDeSaisie.setBounds(50,100, 500, 30);
		pnl.add(champDeSaisie);
		
		calculette.add(pnl);
		
		
		//JPanel
		JPanel panelNum =new JPanel();
		//----------------panel Button--------------------------------
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn0 = new JButton("0");
		
		
		panelNum.add(btn1);
		panelNum.add(btn2);
		panelNum.add(btn3);
		panelNum.add(btn4);
		panelNum.add(btn5);
		panelNum.add(btn6);
		panelNum.add(btn7);
		panelNum.add(btn8);
		panelNum.add(btn9);
		panelNum.add(btn0);
		
		calculette.add(panelNum);
		//----------------panel operateur--------------------------------
		JPanel panelOperateur =new JPanel();
		
		JButton addition = new JButton("+");
		JButton soustraction = new JButton("-");
		JButton division = new JButton("/");
		JButton multiplication = new JButton("*");
		JButton resultat = new JButton("=");
		
		panelOperateur.add(addition);
		panelOperateur.add(soustraction);
		panelOperateur.add(multiplication);
		panelOperateur.add(division);
		panelOperateur.add(resultat);
		
		calculette.add(panelNum);
		
		/*SpringLayout springLayout = new SpringLayout();  
		calculette.setLayout(springLayout); 

		springLayout.putConstraint(SpringLayout.NORTH, panelNum, 30,SpringLayout.SOUTH, pnl);*/
		
		
		calculette.setVisible(true);
	}
	
}
