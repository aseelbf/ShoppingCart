import java.util.ArrayList;

public class ShoppingCart
{
     
   public static ArrayList <Product> Products;
	
	ShoppingCart()
	{
		Products=new ArrayList<Product>();
	}

	public static int getSize(ShoppingCart sc) 
	{	
		return Products.size();
	}

	public void AddProduct(Product p) 
	{
		Products.add(p);
	}
	
	public int Calculate()
	{
		int cost=0;
		for (Product pro : Products )
			cost+=pro.price;
		return cost;	
	}
	

}
