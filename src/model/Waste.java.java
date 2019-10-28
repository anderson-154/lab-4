package model;

public class Waste
{
	//attributes
	private String origin;
	private String type;
	private String color;
	private String identifier;
	private String name;
	
	//buldier
	public Waste(String origin, String type, String color, String identifier, String name,)
	{
		this.origin=origin;
		this.type=type;
		this.color=color;
		this.identifier=identifier;
		this.name=name;
	}
	
	//getters
	public String getOrigin()
	{
		return origin:
	}
	public String getType()
	{
		return Type;
	}
	public String getColor()
	{
		return color;
	}
	public String geyIdentifier()
	{
		return identifier;
	}
	public String getName()
	{
		return name;
	}
	
	//method show all wastes
	public String showAllWaste()
	{
		String showAllWastes=("\nname waste:"+name+"\n origin"+origin+"\n type"+type+"\ncolor"+color+"\nidentifier"+identifier);
		return showAllWastes;
	}
	
	
}