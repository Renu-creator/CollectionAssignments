
/*Given a linked list of integers , find out number of missing elements in linked list. E.g. list
contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } . missing
elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list.*/


package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Que3_missingnums {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		LinkedList<Integer> ll2=new LinkedList<>();
		//3 , 13 , 7 , 2
		
		/*ll.add(2);
		ll.add(3);
		ll.add(7);*/
		
		ll.add(3);
		ll.add(13);
		ll.add(7);
		ll.add(2);

		Collections.sort(ll);
		
		System.out.println(ll);
		
		//Iterator<Integer> itr=ll.iterator();
		
		/*while(itr.hasNext())
		{*/
		
		//for(int )
			int first=ll.getFirst();
			int last=ll.getLast();
			System.out.println(first);
			System.out.println(last);
			
			for(int i=first;i<=last;i++)
			{
				if(ll.contains(i))
				{
					
					
				}
				else
				{
					ll.add(i);
				}
			}
		//}
		
		System.out.println(ll);
	}

}
