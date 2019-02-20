import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest
{
	ShoppingCart sc=new ShoppingCart();
	@Test
	public void test1() 
	{
		
		assertEquals(0,ShoppingCart.getSize(sc));
	}
	
	@Test
	public void test2() 
	
	{
		Product javaBook = new Product("Java Book",127);
		sc.AddProduct(javaBook);
		assertEquals(127,sc.Calculate());
		assertEquals(1,ShoppingCart.getSize(sc));
	}
	
	@Test
	public void test3() 
	
	{
		Product javaBook = new Product("Java Book",127);
		sc.AddProduct(javaBook);
		Product WebBook = new Product("Web Book",100);
		sc.AddProduct(WebBook);
		assertEquals(227,sc.Calculate());
		assertEquals(2,ShoppingCart.getSize(sc));
		
	}

}

