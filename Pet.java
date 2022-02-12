/**
 * author Scott Savannah
 * 
 * 
 * Description:
 *		This is class Pet. It is the concrete or bass class for the kennel problem. 
 *      
 *      This is for hwk2.
 *      
 * 
 * compiles: yes
 * works: yes
 * 
 * Number of hours programming for this course since course started (estimate):  03 
 * 
 * 
 */
public class Pet
{
	//data
	private String name;
	
	//constructor
	public Pet()
	{
		name= null;
	}
	
	public Pet(String namex)
	{
		name = namex;
	}
	
	//methods
	public void makeSound()
	{
		System.out.println("I make this sound: ");
	}
	
	public void print()
	{
		System.out.println("I am an animal and my name is " + name);
	}

}
