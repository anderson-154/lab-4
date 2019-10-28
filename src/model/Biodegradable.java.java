package model;

public class Biodegradable extends Waste implements Usable
{
	private String description;
	private String apteComposting;
	
	public Biodegradable(String origin, String type, String color, String identifier, String name, String description,String apteComposting, boolean usable)
	{
		super(origin, type, color, identifier, name);
		this.description=description;
		this.apteComposting=apteComposting;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getApteComposting()
	{
		return apteComposting;
	}
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
	@Override
	public String showAllWaste()
	{
		return super.showAllWaste()+"description"+description+"if apte composting"apteComposting;
	}
	
}