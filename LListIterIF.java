/**
 * author Scott Savannah
 * 
 * 
 * Description:    
 *      This is an interface for a linked list.
 *      This is for hwk4. 
 *      
 * 
 * compiles: yes
 * works: yes
 * 
 * Number of hours programming for this course since course started (estimate):  14
 * 
 * 
 */
public interface LListIterIF
{
	/**
	 * Description:
	 * This method will append a new data at the end of the list.
	 * @param dx
	 */
	public void append(int dx);
	
	/**
	 * Description:
	 * This method will print message msg on first line
	 * This method will print the data in the list from head to end
	 * one item per line.
	 *
	 * @param msg
	 */
	public void print(String msg);
	
	/**
	 * Desc:
	 * This will find max elt and return the val.
	 * If list is empty return -1.
	 */
	public int findMax();
	
	/**
	 * Description:
	 * This method will delete the specified
	 * value from the list.
	 * If value is not in the list it does not change the list.
	 * If the value is found in the list, it will be removed.
	 * @param dx
	 */
	public void delete(int dx);


}
