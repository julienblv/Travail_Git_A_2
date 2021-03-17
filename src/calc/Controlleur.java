package calc;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Controlleur {
	
	Controlleur(Modele _modele, JTextField _champDeSaisie)
	{
		//  insertion de Champ saisie et modèle pour les ré-utiliser
		Modele modele = _modele;
		JTextField champDeSaisie = _champDeSaisie;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object sourceE = e.getSource();
		
		if (sourceE instanceof JButton)
		{
			
		}
	}
}
