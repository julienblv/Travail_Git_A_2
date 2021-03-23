package calc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

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
		
		//calculette.add(panelOperateur);
		
		SpringLayout springLayout = new SpringLayout();  
		panelNum.setLayout(springLayout); 
		
		//----------------Layout JpanelNum-------------------------------------------
		springLayout.putConstraint(SpringLayout.WEST, btn2, 10,SpringLayout.EAST, btn1);
		springLayout.putConstraint(SpringLayout.WEST, btn3, 10,SpringLayout.EAST, btn2);
		springLayout.putConstraint(SpringLayout.NORTH, btn4, 10,SpringLayout.SOUTH, btn1);
		springLayout.putConstraint(SpringLayout.WEST, btn5, 10,SpringLayout.EAST, btn4);
		springLayout.putConstraint(SpringLayout.NORTH, btn5, 10,SpringLayout.SOUTH, btn2);
		springLayout.putConstraint(SpringLayout.WEST, btn6, 10,SpringLayout.EAST, btn5);
		springLayout.putConstraint(SpringLayout.NORTH, btn6, 10,SpringLayout.SOUTH, btn3);
		springLayout.putConstraint(SpringLayout.NORTH, btn7, 10,SpringLayout.SOUTH, btn5);
		springLayout.putConstraint(SpringLayout.WEST, btn8, 10,SpringLayout.EAST, btn7);
		springLayout.putConstraint(SpringLayout.NORTH, btn8, 10,SpringLayout.SOUTH, btn5);
		springLayout.putConstraint(SpringLayout.WEST, btn9, 10,SpringLayout.EAST, btn8);
		springLayout.putConstraint(SpringLayout.NORTH, btn9, 10,SpringLayout.SOUTH, btn6);
		springLayout.putConstraint(SpringLayout.NORTH, btn0, 10,SpringLayout.SOUTH, btn9);
		
		calculette.setVisible(true);
	}
	
}
