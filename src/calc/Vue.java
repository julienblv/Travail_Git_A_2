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
	Modele modele;
	JPanel pnl ;
	JPanel panelNum ;
	JPanel panelOperateur;

	JTextField champDeSaisie;

	JButton btn1 ;
	JButton btn2 ;
	JButton btn3 ;
	JButton btn4 ;
	JButton btn5 ;
	JButton btn6 ;
	JButton btn7 ;
	JButton btn8 ;
	JButton btn9 ;
	JButton btn0 ;

	JButton addition ;
	JButton soustraction;
	JButton division;
	JButton multiplication ;
	JButton resultat ;

	Vue(Modele _modele){
		modele = _modele;
		
		//--------------JFrame-----------------------------------
		JFrame calculette = new JFrame();
		calculette.setTitle("Calculette");
		calculette.setSize(510,150);
		calculette.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//--------Determination du laout de la Frame---------------
		SpringLayout springLayout = new SpringLayout();  
		calculette.setLayout(springLayout);

		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");

		addition = new JButton("+");
		soustraction = new JButton("-");
		division = new JButton("/");
		multiplication = new JButton("*");
		resultat = new JButton("=");

		//--------1er Panel: JTextField --------------
		pnl =new JPanel();
		pnl.setOpaque(true);
		pnl.setBackground(Color.pink);
		pnl.setPreferredSize(new Dimension(500, 30));
		
		//Ajout du JTextfield au panel
		champDeSaisie = new JTextField(30);
		champDeSaisie.setColumns(35); 
		pnl.add(champDeSaisie);
		
		//Ajout du panel à la Frame
		calculette.add(pnl);

		//--------2eme Panel: Panel de chiffres--------------
		panelNum =new JPanel();
		panelNum.setOpaque(true);
		panelNum.setPreferredSize(new Dimension(250, 100));
		panelNum.setBackground(Color.YELLOW);
		
		//Ajout des boutons au panel
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

		//--------3eme Panel: Panel des Opérateurs--------------
		panelOperateur =new JPanel();
		panelOperateur.setOpaque(true);
		panelOperateur.setBackground(Color.green);
		panelOperateur.setPreferredSize(new Dimension(250, 100));
		
		//Ajout des boutons au panel
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
	public static void main(String[] args)
	{
		Modele modele = new Modele();
		Vue calc = new Vue(modele);
	}

}
