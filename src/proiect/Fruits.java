package proiect;
/**
 * @author Marian,Hara
 * Clasa Fruits care construieste obiecete de tipul fructe
 *
 */

public class Fruits{
	
	String fruits;
	
	/**
	 * 
	 * @param f valoarea cu care se initializeaza obiectul
	 * Constructor cu argumente 
	 */
	
	public Fruits(String f)
	{
		fruits=f;
	}
	
	/**
	 * 
	 * @return returneaza fructul
	 */
	
	public String getFruits()
	{
		return fruits;
	}

}
