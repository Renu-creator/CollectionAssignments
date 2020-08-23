/*WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
Map where key will be marks and value will be List of RollNos where all those students who have 
same marks are together.*/

package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Que6 {

	public static void main(String[] args)
	{
		Student4 st1=new Student4(1, "rahul", 60);
		Student4 st2=new Student4(2, "reena", 70);
		Student4 st3=new Student4(3, "rohan", 80);
		Student4 st4=new Student4(4, "riya", 60);
		
		ArrayList<Integer> al_marks=new ArrayList<>();
		ArrayList<Integer> al_samemarks=new ArrayList<>();
		ArrayList<Integer> al_notsamemarks=new ArrayList<>();
		
		HashSet<Student4> setofstud=new HashSet<>();
		
		setofstud.add(st1);
		setofstud.add(st2);
		setofstud.add(st3);
		setofstud.add(st4);
		System.out.println(setofstud);
		
		HashMap<Integer, ArrayList<Integer>> hm=new HashMap<>();
		
		//setofstud.s
		ArrayList<Student4> list = new ArrayList<>();
		
		 
		  
        // push each element in the set into the list 
        for (Student4 t : setofstud) 
        {
            list.add(t);
        }
        
        System.out.println(list);
        
        list.sort(new Comparator<Student4>() {

			@Override
			public int compare(Student4 o1, Student4 o2) {
				
				if(o1.getMarks()==o2.getMarks())
				{
					al_samemarks.add(o1.getRollno());
					System.out.println(al_samemarks);
					hm.put(o1.getMarks(), al_samemarks);
					Set<Entry<Integer, ArrayList<Integer>>> s=hm.entrySet();
					
					for(Entry<Integer, ArrayList<Integer>> entry:s) 
					{
						System.out.println(entry.getKey()+" - "+entry.getValue());
					}
					//return hm;
				}
				return 0;
			}
		});
		
		/*for(Student4 data:setofstud)
		{
			al_marks.add(data.getMarks());
			
		}
		
		System.out.println(al_marks);
		*/
		/*al_marks.sort(new Comparator<Student4>() {

			@Override
			public int compare(Student4 o1, Student4 o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});*/
		
		/*Set<Entry<Integer, ArrayList<Integer>>> s=hm.entrySet();
		
		for(Entry<Integer, ArrayList<Integer>> entry:s) 
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}*/
		
	}

}
