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
	JPanel pnl =new JPanel();
	JPanel panelNum =new JPanel();
	JPanel panelOperateur =new JPanel();

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
	}
	public static void main(String[] args)
	{

	}

}
