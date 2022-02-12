/**
 * author Scott Savannah
 * 
 * 
 * Description:
 *		This is class kennelPoly. It stores cats and dogs. 
 *      
 *      This is for hwk2.
 *      
 * 
 * compiles: yes
 * works: yes
 * 
 * Number of hours programming for this course since course started (estimate):  04 
 * 
 * 
 */
public class KennelPoly
{
	//main
	public static void main(String args[])
	{
		System.out.println("KennelPoly");
		//Inheritance and poly solution.
		// This array accepts any subclass of Pet.
		Pet[] pets = new Pet[10];
		pets[0] = new Cat("princess");
		pets[1] = new Dog("max");
		pets[2] = new Cat("pepper");
		pets[3] = new Cat("monday");
		for (Pet pet : pets)
		{
			if (pet != null)
			{
				pet.print();
				pet.makeSound();
			}
		}
	}


}
