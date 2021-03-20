package proiect;
/**
 * 
 * Clasa FuitsProduct in care se gaseste array-ul care contine obiectele de tip Fruits
 * si implementeaza interfata Product care creaza un interator
 *
 */
public class FruitsProduct implements Product {
	/**
	 * MAX_FRU=7 este o constanta care desemneaza dimensiunea maxima a array-ului
	 */
	static final int MAX_FRU= 7;
	int index=0; // nr de fructe adaugate
	/**
	 * fruitsList este un array care contine obiecte de tipul Fruits
	 */
	Fruits[] fruitsList;
	/**
	 * Constructorul fara argumente care adauga obiecte de tip fruits in array
	 */
	public FruitsProduct()
	{
		fruitsList = new Fruits[MAX_FRU];
		addFruits("Piersici");
		addFruits("Ananas");
		addFruits("Mere");
		addFruits("Pere");
		
	}
	
	public void addFruits(String s)
	{
		Fruits fruct = new Fruits(s);
		if (index >= MAX_FRU) 
            System.out.println("Full la fructe"); 
        else
        { 
            fruitsList[index]=fruct; 
            index++; 
        } 
	}
	
	
	@Override
	public Iterator createIterator() {
		
		return new FruitsIterator(fruitsList);
	}
	

}

