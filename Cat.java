/**
 * author Scott Savannah
 * 
 * 
 * Description:
 *		This is class Cat. It is a subclass of class Pet. It makes objects that are cats. 
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
public class Cat extends Pet
{
	//data
	private String name;
	
	//constructor
	public Cat()
	{
		name= null;
	}
	
	public Cat(String namex)
	{
		name = namex;
	}
		
	//methods
	public void makeSound()
	{
		System.out.println("I make this sound: meow ");
	}
	
	public void print()
	{
		System.out.println("I am an cat and my name is " + name);
	}


}
