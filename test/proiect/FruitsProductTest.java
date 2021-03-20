package proiect;

import static org.junit.Assert.*;

import org.junit.Test;

public class FruitsProductTest {

	@Test
	public void testFruitsProduct() {
		FruitsProduct fp=new FruitsProduct();
		assertEquals(7, fp.getMax());
		assertEquals(7,fp.fruitsList.length);
		
	}

	@Test
	public void testAddFruits() {
		FruitsProduct fp=new FruitsProduct();
		assertEquals(4, fp.index);
	}

	@Test
	public void testCreateIterator() {
		FruitsProduct fp=new FruitsProduct();
		
	}

}
