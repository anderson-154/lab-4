package model;

public class Recyclable extends Waste implements Usable
{
	//attributes
	public String CARTON="carton";
	public String PAPER="paper";
	public String GLASS="glass";
	public Strign PLASTIC="plastic";
	private String description;
	private String apteComposting;

	//buldier
	public Recyclable(String origin, String type, String color, String identifier, String name, String description, String apteComposting)
	{
		super(origin, type, color, identifier, name);
		this.description=description;
		this.apteComposting=apteComposting;
	}
	//getters	
	public String getDescription()
	{
		return description;
	}
	public String getUsable()
	{
		return usable;
	}
	
	//interfaz if apte comosting
	@Override
	public boolean ApteComposting(int decompositionTime, int year)
	{
		boolean ifApteComposting=false;
		String message="this waste is not usable";
		if(decompositionTime<=year)
		{
			ifApteComposting=true;
			
		}
		return message="this waste is usable";
	}
	//method show all waste
	@Override
	public String showAllWaste()
	{
		return super.showAllWastes()+"\ndescription"+description+"if apte to composting"+apteComposting);
	}
}