/**
 * author Scott Savannah
 * 
 * 
 * Description: 
 * 		This is the Node class. It creates Nodes which will be used in the linked list.    
 *      This is for hwk4. 
 *      
 * 
 * compiles: 
 * works: 
 * 
 * Number of hours programming for this course since course started (estimate):  12
 * 
 * 
 */
public class Node
{
	//data
	private int data;
	private Node rp;  //pointer to the next node
	
	//constructor
	public Node()
	{
		data = 0;
		rp = null;
	}
	
	public Node(int dx)
	{
		data = dx;
	}
	
	//methods
	/*
	 * This method setData sets the data for the node.
	 */
	public void setData(int dx)
	{
		data = dx;
	}
	
	/*
	 * This method getData returns the data from the node.
	 */
	public int getData()
	{
		return(data);
	}
	
	/*
	 * This method setRp sets the right pointer (the reference to the next node on the right)
	 *  for the node.
	 */
	public void setRp(Node nxp)
	{
		rp = nxp;
	}
	
	/*
	 * This method getRp returns the right pointer of the node.
	 */
	public Node getRp()
	{
		return(rp);
	}
	
	/*
	 * This method print prints the data of the node.
	 */
	public void print()
	{
		System.out.println(data);
	}
		

}
