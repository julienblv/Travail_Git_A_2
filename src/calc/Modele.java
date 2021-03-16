package calc;

public class Modele {

	private double nombre1 = 0.;
	private double nombre2 = 0.;

	Modele()
	{
		
	}
	
	public double getNombre1()
	{
		return nombre1;
	}

	public void setNombre1(double nombre1)
	{
		this.nombre1 = nombre1;
	}

	public double getNombre2()
	{
		return nombre2;
	}

	public void setNombre2(double nombre2)
	{
		this.nombre2 = nombre2;
	}
	
	public double addition()
	{
		return nombre1 + nombre2;
	}
	
	public double soustraction()
	{
		return nombre1 - nombre2;
	}
	
	public double multiplication(){
		return nombre1 * nombre2;
	}
	
	public double division() {
		return nombre1 / nombre2;
	}
}
