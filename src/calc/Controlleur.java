package calc;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Controlleur {
	
	Modele modele = new Modele();
	JTextField champDeSaisie;
	
	double operant_Un;
	double operant_Deux;
	
	boolean addition ;
	
	Controlleur(JTextField _champDeSaisie)
	{
		champDeSaisie = _champDeSaisie;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object sourceE = e.getSource();
		
		if (sourceE instanceof JButton)
		{
			JButton bouton_click = (JButton) sourceE;
			String libelle_bouton_click = bouton_click.getText();
			
			if (libelle_bouton_click.equals("+"))
			{
				// récupération de la variable du champ pour 1er chiffre et affichage dans la barre
				String texte = champDeSaisie.getText();
				texte += libelle_bouton_click;
				texte = texte.replace("+", "");
				String texte2 = texte.replace("=", "");
				
				//parsing
				double num1 = Double.parseDouble(texte);
				double num2 = Double.parseDouble(texte2);
				// Utilisation du modele
				modele.setNombre1(num1);
				modele.setNombre2(num2);
				
				champDeSaisie.setText("");
				// c'est une addition
				Boolean addition = true;
			}
			
			if(addition == true) 
			{
				operant_Un = modele.getNombre1();
				operant_Deux = modele.getNombre2();
				double Res = modele.addition();
				champDeSaisie.setText("Resultat : "  + Res);
			}
		}
	}
}
