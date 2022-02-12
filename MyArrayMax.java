/**
 * 
 * author Scott Savannah
 * 
 * Description:
 * 		Write class MyArrayMax.
 * 		This class uses plain array as opposed to something else.
 *		This class performs a number of methods onto an array containing ints.
 *		This is for hwk1.
 *	
 * 
 * 
 * complies: yes
 * works:  yes
 *
 *Number of hours programming for this course since course started (estimate):  01 
 *
 */

public class MyArrayMax
{
	//data
	private int[] data;

		
	/**
	 * Description:
	 * This method will take argument an initialized array.
	 * It will copy the array to the the array data in the class.
	 */
	public void init(int[] datax)
	{
		data = datax;
	}
	
	/**
	 * Description:
	 * This method will print the content of the array on a single line seperated by tabs.
	 */
	public void print()
	{
		for(int i =0; i < data.length; i++ )
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();

	}
	
	/**
	 * Description:
	 * This method will find the largest odd element.
	 */
	public int findMaxOdd()
	{
		int maxOdd = 0;
		for(int i =0; i < data.length; i++)
		{
			if ((data[i] % 2) == 1)
			{
				if (data[i] > maxOdd)
				{
					maxOdd = data[i];
				}
			}
		}
		return maxOdd;

	} 
	
	
	
	/**
	 * Description:
	 * This method find the sum of all elements with even value
	 */
	public int findSumEven()
	{
		int sumEven=0;
		for(int i =0; i < data.length; i++)
		{
			if ((data[i] % 2) == 0)
			{
				sumEven = sumEven + data[i];
			}
		}
		return sumEven;
	}
	
	
	
	/**
	 * Description:
	 * This method will reverse the values in the data array.
	*/ 
	public void reverseArray()
	{
		int[] newArr = new int[data.length];
		int count = data.length -1;
		for(int i=0; i < data.length; i++)
		{
			newArr[i] = data[count];
			count--;
			
		}
		data = newArr;

	}
	



	public static void main(String[] args)
	{
		//You will submit your program with the data I have here.
		//I suggest you test your program with more than what I show over here.
		// When done testing, your code in MAIN will ***look like this***. this.***
				
		int[] test1 = { 2, 5, 7, -20, -30, 20 };
				
		MyArrayMax myarr = new MyArrayMax();
		myarr.init(test1);
				
		System.out.println("original array");
		myarr.print();
				
		System.out.println("maxOdd=" + myarr.findMaxOdd());
		System.out.println("sumEven=" + myarr.findSumEven());
				
		System.out.println("reversed array");
		myarr.reverseArray();
		myarr.print();


	}

}
