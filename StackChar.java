/**
 * author Scott Savannah
 * 
 * 
 * Description: 
 * 		This is Class StackChar and it creates a stack ADT for storing chars.
 * 		It has the methods push, pop, peek, and prints.     
 *      This is for hwk3. 
 *      
 * 
 * compiles: yes
 * works: yes
 * 
 * Number of hours programming for this course since course started (estimate):  12
 * 
 * 
 */
public class StackChar
{
	//data
	private char[] data;
	private int top;
	private int size;	
	
	//constructor
	public StackChar(int szx)
	{
		size = szx;
		data = new char[size];
		top = -1;
	}
	
	//methods
	
	/* Description:
	 * This is the push method. It will push on top of the stack an item.
	 */
	public void push(char chx)
	{
		if (top != (size-1)) //checks if it is full
		{
			top++;
			data[top] = chx;
		}
		else
		{
			System.out.println("error: stack is full");
		}
	}
	
	/* Description:
	 * This is the pop method. It will remove (pop) the item on the top of the stack and return it.
	 */
	public char pop()
	{
		char chx;
		if(top >= 0) //checks if stack is empty
		{
			chx = data[top];
			//remove top char
			char[] newData = new char[size]; //placeholder
			for(int i =0; i < top; i++)
			{
				newData[i] = data[i]; //copy all data besides data[top]
			}
			for(int i =0; i < newData.length; i++)
			{
				data[i] = newData[i]; //copy new arr back to data
			}
			
			top--;
			return(chx);
		}
		else
		{
			System.out.println("error: stack is empty, cannot pop");
			return('!');
		}
	}
	
	/* Description:
	 * This is the peek method. It will identify the top item of the stack and return it.
	 */
	public char peek()
	{
		char chx;
		if(top >= 0)
		{
			chx = data[top];
			return(chx);
		}
		else
		{
			System.out.println("error: stack is empty, cannot peek");
			return('!');
		}
		
	}
	
	/* Description:
	 * This is the prints method. It will print the contents if the stack from bottom to top.
	 * It will be done on a single line.
	 */
	public void prints()
	{
		for(int i =0; i < data.length; i++)
		{
			System.out.printf("%c    ", data[i]);
		}
		System.out.println();
	}
	
	//main
	public static void main(String[] args)
	{
		StackChar sc = new StackChar(10);
		
		//after each stack method push, pop, peek, you will use prints().
		//push 6 a-f letters of alphabet in normal order
		sc.push('a');
		sc.prints();
		sc.push('b');
		sc.prints();
		sc.push('c');
		sc.prints();
		sc.push('d');
		sc.prints();
		sc.push('e');
		sc.prints();
		sc.push('f');
		sc.prints();
		
		//push the next letter of alphabet
		sc.push('g');
		sc.prints();
		
		//pop 1
		sc.pop();
		sc.prints();
		
		//push the next letter of alphabet
		sc.push('h');
		sc.prints();
		
		//pop 2
		sc.pop();
		sc.prints();
		sc.pop();
		sc.prints();
		
		//push the next letter of alphabet
		sc.push('i');
		sc.prints();
		
		//pop 3
		sc.pop();
		sc.prints();
		sc.pop();
		sc.prints();
		sc.pop();
		sc.prints();
		
		//peek and print what the peek gives.
		sc.peek();
		sc.prints();
		System.out.println("peek: " + sc.peek());
			
		
	}

}
