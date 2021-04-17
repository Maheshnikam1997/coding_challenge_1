package educationCulture;

public class EducationSystem {
	public static void main(String [] args)
	{
		Graduation gd = new Graduation();
		Engineering eg = new Engineering();
		ComputerScienceENgineering cse = new ComputerScienceENgineering();
		//all methods define in graduation class
		System.out.println(" all methods define in graduation class:\n");
		gd.streams();
		gd.hscPercentage();
		gd.ageCritera();
		
		//all methods define in Engineering class
		System.out.println("\n all methods define in Engineering class:\n");
		eg.streams();
		eg.typeOfEngineering();
		
		//all methods define in ComputerScienceEngineering class
		System.out.println("\n all methods define in ComputerScienceEngineering class:\n");
		cse.hscPercentage();
		cse.subjects();
	}
}


/**
 * all methods define in graduation class:

BCA, BBA, B.E.
for graduation minimun 60% is critera
for graduation minimun age critera for cadidate is 20 years

 all methods define in Engineering class:

Computer Sciance, Information Technology, Electronics & Mechanical Engineering
Engineeing can be done as Regular as well as from distance learing

 all methods define in ComputerScienceEngineering class:

To get admission for Computer Science Engineering HSC percentage should be minimun 65%
Core Java, C sharp & Python are subjects offered in Computer Science Engineering
/
 */