/**
 * author Scott Savannah
 * 
 * 
 * Description:
 *		This is class Dog. It is a subclass of class Pet. It makes objects that are dogs. 
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
public class Dog extends Pet
{
	//data
	private String name;
	
	//constructor
	public Dog()
	{
		name= null;
	}
	
	public Dog(String namex)
	{
		name = namex;
	}
		
	//methods
	public void makeSound()
	{
		System.out.println("I make this sound: bark");
	}
	
	public void print()
	{
		System.out.println("I am an dog and my name is " + name);
	}


}
