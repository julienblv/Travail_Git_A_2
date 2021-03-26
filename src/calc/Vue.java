package calc;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Vue 
{
	
	public static void main(String[] args)
	{
		//--------------JFrame-----------------------------------
		JFrame calculette = new JFrame();
		calculette.setTitle("Calculette");
		calculette.setSize(510,150);
		calculette.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//--------Determination du laout de la Frame---------------
		SpringLayout springLayout = new SpringLayout();  
		calculette.setLayout(springLayout);
		
		//--------1er Panel: JTextField --------------
		JPanel pnl =new JPanel();
		pnl.setOpaque(true);
		pnl.setBackground(Color.pink);
		pnl.setPreferredSize(new Dimension(500, 30));
		
		JTextField champDeSaisie = new JTextField(30);
		champDeSaisie.setColumns(35); 
		pnl.add(champDeSaisie);
		
		// ajout du panel à la Frame
		calculette.add(pnl);
		
		//--------2eme Panel: Panel de nombre--------------
		JPanel panelNum =new JPanel();
		panelNum.setOpaque(true);
		panelNum.setPreferredSize(new Dimension(250, 100));
		panelNum.setBackground(Color.YELLOW);
		

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
		
		//Ajout du panel à la Frame
		calculette.add(panelNum);
		
		//--------2eme Panel: Panel des Opérateurs--------------
		JPanel panelOperateur =new JPanel();
		panelOperateur.setOpaque(true);
		panelOperateur.setBackground(Color.green);
		panelOperateur.setPreferredSize(new Dimension(250, 100));
		
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
		
		//Ajout du panel à la Frame
		calculette.add(panelOperateur);
		
		//definition des Layout
		springLayout.putConstraint(SpringLayout.NORTH,panelNum ,0,SpringLayout.SOUTH, pnl);
		springLayout.putConstraint(SpringLayout.NORTH,panelOperateur ,0,SpringLayout.SOUTH, pnl);
		springLayout.putConstraint(SpringLayout.WEST,panelOperateur ,0,SpringLayout.EAST, panelNum);
		
		// on rend visible la Frame
		calculette.setVisible(true);
	}
	
}
