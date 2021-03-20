package proiect;
public class VegetablesStock {
	VegetablesProduct vegetables;
	
	public VegetablesStock(VegetablesProduct vegetables)
	{
		this.vegetables=vegetables;
	}
	
	public void printVegetables()
	{
		Iterator iterator = vegetables.createIterator();
		System.out.println("---------Vegetables STOCK----------");
		while(iterator.hasNext())
		{
			Vegetables v = (Vegetables)iterator.next();
			System.out.println(v.getVegetables());
		}
	}

}
