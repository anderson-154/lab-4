package model;

public class Inert extends Waste
{
	private String tips;
	
	public Inert(String origin, String type, String color, String identifier, String name, String tips)
	{
		super(origin, type, color, identifier, name);
		this.tips=tips;
	}
	public String getTips()
	{
		return tips;
	}
	public String someTips()
	{
		System.out.println=("Opt for food products produced near your location. This saves packaging and transportation. Buying in bulk avoids unnecessary packaging");
		System.out.println=("Reject food that comes in white cork trays");
		System.out.println=("Prioritize the consumption of fresh foods, have less packaging and are healthier");
		System.out.println=("Use recyclable glass bottles instead of cans, bricks or plastic containers. Also, when buying beverages, opt for large containers");
	}
	
	@Override
	public String showAllWaste()
	{
		return super.showAllWastes()+"tips"+tips;
	}
}