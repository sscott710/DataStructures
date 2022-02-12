/**
 * author Scott Savannah
 * 
 * 
 * Description:
 *		This class ArrayOfNames uses different methods to edit an array of strings containing names.
 *		The methods include append, insert, delete (a specific index), print, and delete (all). 
 *      
 *      This is for hwk1.
 *      
 * 
 * compiles: yes
 * works: yes
 * 
 * Number of hours programming for this course since course started (estimate):  02 
 * 
 * 
 */
public class ArrayOfNames
{
	// data
	private String[] names;
	private int len;

	//contructor
	public ArrayOfNames(int szx)
	{
		names = new String[szx];
		len = szx;

	}
	
	/**
	 * Description:
	 * This method will try to append name into the array.
	 * Append means it will insert name in first empty slot
	 * 
	 * If the whole array is full it will print: "append error: array is full".
	 */
	public void append(String rec)
	{
		for(int i =0; i < names.length; i++)
		{
			if (names[i] == null)
			{
				names[i] = rec;
				return;
			}
		}
		System.out.println("append error: array is full");

	}

	/**
	 * Description:
	 * This method will try to insert new name into specific slot.
	 * If slot is empty, insert new String.
	 * If slot is not empty, print "insert: error" and do nothing.
	 */
	public void insert(int ix, String rec)
	{
		if(names[ix] == null)
		{
			names[ix] = rec;
		}
		else
		{
			System.out.println("insert: error");
		}
	}

	/**
	 * Description:
	 * This method will try to delete name.
	 * If slot is empty, print "delete: error"..
	 * If slot is not empty, delete the String and print it.
	 */
	public void delete(int ix)
	{
		if(names[ix] == null)
		{
			System.out.println("delete: error");
		}
		else
		{
			System.out.println(names[ix] + " was deleted");
			names[ix] = null;
		}
	}


	/**
	 * Description:
	 * This method will print all names, one string per line.
	 */
	public void print()
	{
		System.out.println("start print array");
		for(int i =0; i < names.length; i++)
		{
			if (names[i] != null)
			{
				System.out.println(names[i]);
			}
		}
	
		System.out.println("end print array\n");
	}
	
	/**
	 * Description:
	 * Delete all names.
	 */
	public void delete()
	{
		for(int i =0; i < names.length; i++)
		{
			names[i] = null;
		}

	}




	public static void main(String[] args)
	{
		ArrayOfNames aor = new ArrayOfNames(10);
		
		
		String r1 = "joe";
		String r2 = "bill";
		String r3 = "evelyn";
		String r4 = "lori";
		String r5 = "beth";
		String r6 = "carl";
		String r7 = "jess";
		String r8 = "faye";

		aor.insert(3, r1);
		aor.print();
		aor.append(r2);
		aor.print();
		aor.insert(2, r3);
		aor.print();
		aor.delete(2);
		aor.print();
		aor.insert(5, r5);
		aor.print();
		aor.append(r6);
		aor.print();
		aor.insert(1, r7);
		aor.print();
		aor.delete();
		aor.append(r8);
		aor.print();
		


	}

}
