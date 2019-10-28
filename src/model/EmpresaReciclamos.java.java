package model;

public class EmpresaReciclamos
{
	//attributes
	private String name;
	private Waste[] wastes;
	private Product[] products;
	private int posWaste=0;
	private int posProduct=0;
	
	//buldier
	public EmpresaReciclamos(String name, int posWaste, int posProduct)
	{
		this.name=name;
		this.Waste[] wastes=new wastes[];
		this.Product[] products=new products[];
		this.posWaste=posWaste;
		this.posProduct=posProduct;
	}
	//getters 
	public String getName()
	{
		return name;
	}
	public int getPosWaste()
	{
		return posWaste;
	}
	public int getPosProduct()
	{
		return posProduct;
	}
	//method add waste
	public void addWaste(String origin, String type, String color, String identifier, String name, double harmfulEffect)
	{
		Waste[posWaste]=new Waste(origin, type, color, identifier, name, harmfulEffect);
		posWaste++;
	}	
	//method to search waste from name
	public String searchWasteFromName(String name)
	{
		String searchWaste=("waste not found");
		for(int i=0;i<wastes.length-1;i++)
		{
			if(wastes[i].getName().equals(name))
			{
				System.out.println(wastes[i].searchWaste());
			}
		}
		return searchWaste;
	}
	//method add product
	public void addProduct(String name, String identifier)
	{
		Product[posProduct]=new Product(name, identifier);
		posProduct++;
	}
	//method to search product from identifier
	public String searchProductFromIdentifier(String identifier)
	{
		String searchProduct=("product not found");
		for(int i=0;i<products.length-1;i++)
		{
			if(products[i].getIdentifier().equals(identifier)
			{
				System.out.println(products[i].searchProduct());
			}
		}
		return searchProduct;
	}
	
	//method show list to products
	public String showListProduct()
	{	
		String infoProduct=("");
		for(int i=0;i<=products.length-1;i++)
		{
			infoProduct=infoProduct+products[i].getName()+products[i].getIdentifier();
		}
		return infoProduct;
	}	
	
}