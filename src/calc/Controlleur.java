package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Controlleur implements ActionListener, KeyListener
{

	private Modele modele ;
	JTextField champDeSaisie;

	double operant_Un;
	double operant_Deux;

	//Ajouté
	String texte;
	String texte2;
	double num1;
	double num2;
	double inum1;
	double inum2;
	double resultat;

	boolean addition ;
	boolean soustraction ;
	boolean multiplication;
	boolean division;

	Controlleur(Modele _modele,JTextField _champDeSaisie)
	{
		modele=_modele;
		champDeSaisie = _champDeSaisie;
	}

	public void actionPerformed(ActionEvent e)
	{
		Object sourceE = e.getSource();

		if (sourceE instanceof JButton)
		{
			JButton bouton_click = (JButton) sourceE;
			String libelle_bouton_click = bouton_click.getText();

			///////////////////////////////////////// Addition ///////////////////////////////////
			if (libelle_bouton_click.equals("+"))
			{
				// récupération de la variable du champ pour 1er chiffre et affichage dans la barre
				texte = champDeSaisie.getText();
				texte += libelle_bouton_click;
				texte = texte.replace("+", "");
				texte2 = texte.replace("=", "");

				//parsing
				num1 = Double.parseDouble(texte);
				num2 = Double.parseDouble(texte2);

				// Utilisation du modele
				modele.setNombre1(num1);
				modele.setNombre2(num2);

				champDeSaisie.setText("");
				// c'est une addition
				addition = true;
			}
			/*if(addition == true) 
			{
				operant_Un = modele.getNombre1();
				operant_Deux = modele.getNombre2();
				double Res = modele.addition();
				champDeSaisie.setText("Resultat : "  + Res);
			}*/

			///////////////////////////////////////// Soustraction ///////////////////////////////////
			if (libelle_bouton_click.equals("-"))
			{
				// récupération de la variable du champ pour 1er chiffre et affichage dans la barre
				texte = champDeSaisie.getText();
				texte += libelle_bouton_click;
				texte = texte.replace("-", "");
				texte2 = texte.replace("=", "");

				//parsing
				num1 = Double.parseDouble(texte);
				num2 = Double.parseDouble(texte2);

				// Utilisation du modele
				modele.setNombre1(num1);
				modele.setNombre2(num2);

				champDeSaisie.setText("");
				// c'est une addition
				soustraction = true;
			}

			/*if(soustraction == true) 
			{
				operant_Un = modele.getNombre1();
				operant_Deux = modele.getNombre2();
				double Res = modele.soustraction();
				champDeSaisie.setText("Resultat : "  + Res);
			}*/

			///////////////////////////////////////// Multiplication ///////////////////////////////////
			if (libelle_bouton_click.equals("*"))
			{
				// récupération de la variable du champ pour 1er chiffre et affichage dans la barre
				texte = champDeSaisie.getText();
				texte += libelle_bouton_click;
				texte = texte.replace("-", "");
				texte2 = texte.replace("=", "");

				//parsing
				num1 = Double.parseDouble(texte);
				num2 = Double.parseDouble(texte2);
				// Utilisation du modele
				modele.setNombre1(num1);
				modele.setNombre2(num2);

				champDeSaisie.setText("");
				// c'est une addition
				multiplication = true;
			}

		/*	if(multiplication == true) 
			{
				operant_Un = modele.getNombre1();
				operant_Deux = modele.getNombre2();
				double Res = modele.multiplication();
				champDeSaisie.setText("Resultat : "  + Res);
			}
*/
			///////////////////////////////////////// Division ///////////////////////////////////
			if (libelle_bouton_click.equals("/"))
			{
				// récupération de la variable du champ pour 1er chiffre et affichage dans la barre
				texte = champDeSaisie.getText();
				texte += libelle_bouton_click;
				texte = texte.replace("-", "");
				texte2 = texte.replace("=", "");

				//parsing
				num1 = Double.parseDouble(texte);
				num2 = Double.parseDouble(texte2);
				// Utilisation du modele
				modele.setNombre1(num1);
				modele.setNombre2(num2);

				champDeSaisie.setText("");
				// c'est une addition
				division = true;
			}

			/*if(division == true) 
			{
				operant_Un = modele.getNombre1();
				operant_Deux = modele.getNombre2();
				double Res = modele.multiplication();
				champDeSaisie.setText("Resultat : "  + Res);
			}*/
			if (libelle_bouton_click.equals("="))
			{

				texte2 = champDeSaisie.getText();
				texte2 += libelle_bouton_click;
				texte2 = texte2.replace("+", "");
				texte2 = texte2.replace("-", "");
				texte2 = texte2.replace("*", "");
				texte2 = texte2.replace("/", "");
				texte2 = texte2.replace("=", "");

				num1 = Double.parseDouble(texte);
				num2 = Double.parseDouble(texte2);
				
				//num2 = texte2;
				champDeSaisie.setText("");

				//parsing des deux variables 
				//inum1 = Double.parseDouble(num1);
				//inum2 = Double.parseDouble(num2);

				//vérif du parsage
				if(inum1 !=0 && inum2 !=0) 
				{	
					System.out.println("parsed");
				}
				else
				{
					System.out.println("error : parsing error");
				}


				//Résultat selon les opérations
				if(addition == true) 
				{
					resultat=inum1+inum2;
					champDeSaisie.setText("Resultat : "  + resultat);
				}
				if (soustraction == true)
				{
					resultat=inum1-inum2;
					champDeSaisie.setText("Resultat : "  + resultat);
				}
				if (multiplication == true)
				{
					resultat=inum1*inum2;
					champDeSaisie.setText("Resultat : "  + resultat);
				}
				if (division == true)
				{
					resultat=inum1/inum2;
					champDeSaisie.setText("Resultat : "  + resultat);
				}

			}

			//Ajout
			else
			{
				texte = champDeSaisie.getText();
				texte += libelle_bouton_click;
				champDeSaisie.setText(texte);

			}

		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent ke) {
		System.out.println("keyTyped KE: " + ke);
		Object sourceE = ke.getSource();
		if (sourceE instanceof JTextField)
		{
			// on récupère la valeur du txt
			JTextField champ_click = (JTextField) sourceE;

		}

	}
}
