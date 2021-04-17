package educationCulture;

public class EducationSystem {
	public static void main(String [] args)
	{
		Graduation gd = new Graduation();
		Engineering eg = new Engineering();
		ComputerScienceENgineering cse = new ComputerScienceENgineering();
		
		System.out.println(" all methods define in graduation class:\n");
		gd.streams();
		gd.hscPercentage();
		gd.ageCritera();
		
		System.out.println("\n all methods define in Engineering class:\n");
		eg.streams();
		eg.typeOfEngineering();
		
		System.out.println("\n all methods define in ComputerScienceEngineering class:\n");
		cse.hscPercentage();
		cse.subjects();
	}
}
