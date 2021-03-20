package proiect;
/**
 * 
 * @author Marian
 * In Main se construiste un obiect de tip FruitsProduct care este folosit pentru
 * construirea unui obiect de tip FruitsStock unde este implementata funcita pentru iterare
 *
 */
public class Main {

	public static void main(String[] args) {
		VegetablesProduct vp = new VegetablesProduct();
		VegetablesStock vs = new VegetablesStock(vp);
		vs.printVegetables();
		FruitsProduct fp=new FruitsProduct();
		FruitsStock fs= new FruitsStock(fp);
		fs.printFruits();

	}

}
