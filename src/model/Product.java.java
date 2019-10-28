package model;

public class Product
{
	//constant and attributes
	public String INDUSTRIAL="industrial";
	public String HOME="home";
	public String BULDING="building";
	public String MUNICIPAL="municipal";
	public String HOSPITABLE="hospitable";
	private String name;
	private String identifier;
	
	//buldier
	public Product(String name, String identifier)
	{
		this.name=name;
		this.identifier=identifier;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	public String getIdentifier()
	{
		return identifier;
	}
	
	//method show all products
	public String showAllProduct()
	{
		String showAllProducts=("\nname product"+product+"\nidentifier product"+identifier);
		return showAllProducts;
	}
	
}