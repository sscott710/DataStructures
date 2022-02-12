/**
 * author Scott Savannah
 * 
 * 
 * Description:    
 * : Linked List program 
 * 
 * The list holds int value.
 * This is an iterative solution.
 * 
 * Plan:
 * append
 * 
 * print
 * findMax
 * delete
 * You may want to study other methods that may be useful.
 * 
 * 
 * If there is a problem like list is empty or whatever do not throw exception
 * but print some appropriate message.
 * 
 * 
 * If there are duplicate values,
 * the operation will apply to the first value found. For example delete(x).
 * Ex:
 * LL= { 20, 10, 30, 10 } delete 10 will delete the first 10.

 *      This is for hwk4. 
 *      
 * 
 * compiles: yes
 * works: yes
 * 
 * Number of hours programming for this course since course started (estimate):  16
 * 
 * 
 */
public class LListIter implements LListIterIF
{
	//data 
	private Node head;
	//constructor
	public LListIter()
	{
		head = null;
		
	}
	
	/**
	 * Description:
	 * This method will append a new data at the end of the list.
	 */
	public void append(int dx)
	{
		Node nxp;
		Node rnp;
		
		// if was empty
		if (head == null) 
		{
			nxp = new Node(dx);
			head = nxp;
			return;
		}
		
		//list not empty
		//data in head
		rnp = head;
		while (rnp.getRp() != null)
		{
			rnp = rnp.getRp();
		}
		
		nxp = new Node(dx);
		rnp.setRp(nxp);
		
	}
	
	/**
	 * Description:
	 * This method will print message msg on first line
	 * This method will print the data in the list from head to end
	 * one item per line.
	 */
	public void print(String msg)
	{
		System.out.println(msg);
		Node rnp;
		rnp = head;
		
		while(rnp != null)
		{
			rnp.print();
			rnp = rnp.getRp();
		}
		if (rnp == null)
		{
			System.out.println("list is empty, nothing to print");
		}
		
	}
	
	/**
	 * Desc:
	 * This will find max elt and return the val.
	 * If list is empty return -1.
	 */
	public int findMax()
	{
		Node rnp;
		rnp = head;
		int max = 0;
		
		while(rnp != null)
		{
			if(rnp.getData() > max)
			{
				max = rnp.getData();
			}
			rnp = rnp.getRp();
			
		}
		if (head != null)
		{
			return(max);
		}
		return(-1);
		
	}
	
	/**
	 * Description:
	 * This method will delete the specified
	 * value from the list.
	 * If value is not in the list it does not change the list.
	 * If the value is found in the list, it will be removed.
	 */
	public void delete(int dx)
	{
		//if the list is empty
		if (head == null)
		{
			System.out.println("List is empty, nothing to delete");
			return;
		}
		
		//if the item is in the head
		if (head.getData() == dx)
		{
			head = head.getRp();
			return;
		}
		
		Node n1, n2;
		n1 = head;
		n2 = n1.getRp();
		while (n2 != null)
		{
			if(n2.getData() == dx)
			{
				n1.setRp(n2.getRp());
				return;
			}
			n1 = n2;
			n2 = n2.getRp();
		}
		
		//if dx not found in list
		if(n2 == null)
		{
			System.out.println("Value not found in list; nothing deleted");
		}
		
	}
	
	//main
	public static void main(String[] args)
	{
		LListIter list = new LListIter();
		//list.append(20);
		//list.append(10);
		//list.append(30);
		//list.append(10);
		list.print("test 1");
		System.out.println("Max is: " + list.findMax());
		list.delete(40);
		//list.print("test 2");
		
		
	}

}
