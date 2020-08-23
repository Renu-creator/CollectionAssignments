/*Given two LinkedList, we need to combine two LinkedList  in such a way that the combined aList has alternate elements of 
 * both. If one list has extra element, then these elements are appended at the end of the combined list.

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}
*/


package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Que14_jointwoLinkLists {
	public static void main(String[] args) 
	{
		LinkedList<Integer> link1=new  LinkedList<>();
		link1.add(1);
		link1.add(2);
		link1.add(3);
		link1.add(4);
		link1.add(5);
		link1.add(6);
		
		LinkedList<Integer> link2=new  LinkedList<>();
		link2.add(11);
		link2.add(22);
		link2.add(33);
		link2.add(44);
		
		Integer[] arr1 = link1.toArray(new Integer[link1.size()]);
		int n1=arr1.length;
		
		Integer[] arr2 = link2.toArray(new Integer[link2.size()]);
		int n2=arr2.length;
		
		Integer arr3[] = new Integer[n1+n2];
		
		int i = 0, j = 0, k = 0; 
	      
        // Traverse both array 
        while (i < n1 && j < n2) 
        { 
            arr3[k++] = arr1[i++]; 
            arr3[k++] = arr2[j++]; 
        } 
      
        // Store remaining elements of first array 
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
      
        // Store remaining elements of second array 
        while (j < n2) 
            arr3[k++] = arr2[j++]; 
		
        System.out.println("After merging two linklists"); 
		
		//create new empty linked list
		LinkedList<Integer> link3 = new LinkedList<Integer>();
		 
		//add all elements of an array to linked list
		Collections.addAll(link3, arr3);
		 
		//print LinkedList
		for(Integer num : link3){
		    System.out.println( num );
		}

	}

}





/*/*if(n1>n2)
{
arr3[i]=ll1_array[i];
}
else
{
arr3[j]=ll1_array[j];
}*/

/*for(int i=0;i<=ll1_array.length;i++)
//for(Integer l1:link1)
{
//link3.add(l1);

//link3.add(e)

int num1=ll1_array[i];

link3.add(num1);

//for(Integer l2:link2)
for(int j=0;j<=ll2_array.length;j++)
{
	//link3.add(l2);
	int num2=link1.get(i);
	link3.add(num2);
	
	int num1=ll1_array[i];
	
	link3.add(num1);
	
	int num2=ll2_array[j];
	
	link3.add(num2);
}
}*/


/*LinkedList<Integer> final = Arrays.asList(arr3);

for(Integer ll3:link3)
{

System.out.println(ll3);
}
*/