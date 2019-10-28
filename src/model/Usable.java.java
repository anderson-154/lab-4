package model;
public interface Usable
{
	boolean ApteComposting(int decompositionTime, int year);
		boolean ifApteComposting=false;
		String message="this waste is not usable";
		if(decompositionTime<=year)
		{
			ifApteComposting=true;
			
		}
		
		return message="this waste is usable";

}