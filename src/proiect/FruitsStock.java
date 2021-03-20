package proiect;
/**
 * 
 * @author Marian
 *
 */
public class FruitsStock {
	/**
	 * @param fruits un obiect care contine informatiile clasei FruitsProduct unde 
	 *  se gaseste array-ul cu fructe
	 */
	FruitsProduct fruits;
	/**
	 * Constructorul clasei FruitsStock care are ca argument un obiect de tip FruitsProduct
	 * @param fruits
	 */
	public FruitsStock(FruitsProduct fruits)
	{
		this.fruits=fruits;
	}
	/**
	 * Functie de afisare a array-ul iterat
	 */
	public void printFruits()
	{
		/**
		 * cu ajutorul unui obiect de tip fruitsProduct se creaza iteratorul 
		 */
		Iterator iterator=fruits.createIterator();
		System.out.println("---------Fruits STOCK----------");
		while(iterator.hasNext())
		{
			Fruits f = (Fruits)iterator.next();
			System.out.println(f.getFruits());
		}
	}

}
