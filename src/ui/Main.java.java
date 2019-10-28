package ui;
import java.util.Scanner;
import model.EmpresaReciclamos;
import model.Product;
import model.Waste;
import model.Biodegradable;
import model.Inert;
import model.Recyclable;
import model.Usable;
import model.HarmfullEffect;

public class Main
{
	private static Scanner reader=new Scanner(System.in);
	private static EmpresaReciclamos reciclamos=new EmpresaReciclamos();
	
	public static void main(String[]args)
	{
		int opcion=0;
		int opcion2=0;
		String name="";
		
		System.out.println("welcome to company reciclamos");
		do
		{
			System.out.println("\n1.add a waste. \n2.add a product. \n3.Search the information of a waste by waste name. \n4.Search the information of a waste by waste identifier. \n5.Show a list of registered products. \n6.Biodegradable or recyclable waste is usable.");
			opcion=reader.nextInt();
			switch(opcion)
			{
				case 1:
				System.out.println("write the name of the residue");
				name=reader.next();
				System.out.println("\n1.biodegradable \n2.Inert \n3.recyclable");
				opcion2=reader.nextInt();
				switch(opcion2)
				{
					case 1:
					Biodegradable waste1 = new Biodegradable(name);
					System.out.println(reciclamos.addWaste(waste));
					break;
					case 2:
					Inert waste2 = new Inert(name);
					System.out.println(reciclamos.addWaste(waste));
					break;
					case 3:
					Recyclable waste3 = new Recyclable(name);
					System.out.println(reciclamos.addWaste(waste));
					break;
				}
				break;
				
				case 2:
				System.out.println("write the name of the product");
				System.out.println("\n1.Industrial. \n2. home. \n3. bulding. \n4. municipal.\n5. hospitable");
				name=reader.next();
				
				Product product = new Product(name);
				System.out.println(reciclamos.addProduct(product));
				
				break;
				
				case 3:
				System.out.println("this the information of the waste by waste name.");
					EmpresaReciclamos.searchWasteFromName(name);
				break;
				
				case 4:
				System.out.println("this the information of the waste by waste identifier.");
					EmpresaReciclamos.searchProductFromIdentifier(identifier);
				break;
				
				case 5:
				System.out.println("Show a list of registered products"	);
					EmpresaReciclamos.showListProduct();
				break;
				
				case 6:
				System.out.println("Biodegradable or recyclable waste is usable");
					Biodegradable.ApteComposting(decompositionTime, year)
				break;
				
			}
			
		}

	}
	
	
}