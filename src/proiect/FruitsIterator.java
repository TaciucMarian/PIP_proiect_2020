package proiect;
/**
 * @author Marian,Hara
 * Iteratorul pentru fructe
 *
 */
public class FruitsIterator implements Iterator 
{
	/**
	 * Array-ul care contine toate fructele
	 */
	Fruits fruitsList[];
	int pos = 0;
	/**
	 * Constructor pentru FruitsIterator
	 * @param fru[] va contine lista de obiecte prin care iteram
	 */
	public FruitsIterator (Fruits fru[])
	{
		fruitsList=fru;
	}
	
	
	@Override
	/**
	 * Functie care verifica daca mai sunt elemente de parcurs in array-ul de fructe
	 */
	
	public boolean hasNext() {
		if(pos >= fruitsList.length || fruitsList[pos]== null)
			return false;
		else
			return true;
	}

	@Override
	/**
	 * Functie care itereaza pentru array-ul de fructe
	 */
	public Object next() {
			Fruits fruits = fruitsList[pos];
				pos+=1;
			return fruits;
		
	}

}
