/*There is a HashSet which has student objects. Create two arraylists from this
hashset. In one arraylist called ‘placedStudents’ insert all students who have
been placed and in another arraylist ‘unplacedStudents’
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)

hashset properties:
1.no duplicate val
2.no iteration order
3.allows null value
4.implements SET inreface
5.not synchronized
underlying DS is hashtable,Objects are inserted based on hashcode*/


package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Que20 {

	public static void main(String[] args) 
	{
		
		Student2 s1=new Student2(101, "ram", "BE", 2018, true);
		Student2 s2=new Student2(102, "sam", "BE", 2019, true);
		Student2 s3=new Student2(103, "rina", "BE", 2014, false);
		Student2 s4=new Student2(104, "siya", "ME", 2013, false);
		
		HashSet<Student2> hs=new HashSet<>();
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		System.out.println(hs);
		
		ArrayList<Student2> al_pl=new ArrayList<>();
		ArrayList<Student2> al_unpl=new ArrayList<>();
		
		
		Iterator<Student2> itr=hs.iterator();
		
		while(itr.hasNext())
		{
			Student2 entry=itr.next();
			
			if(entry.getPlaced()==true)
			{
				al_pl.add(entry);
				/*String placedstudnm=entry.getStudnm();
				System.out.println(placedstudnm);*/
				//System.out.println("name of placed students:"+entry.getStudnm()+" "+entry.getStudid());
			}
			
			else
			{
				al_unpl.add(entry);
				/*String unplacedstudnm=entry.getStudnm();
				System.out.println(unplacedstudnm);*/
				//System.out.println("name of placed students:"+entry.getStudnm()+" "+entry.getStudid());
			}
			
		}
		
		System.out.println("list of placed students:"+al_pl);
		System.out.println("list of unplaced students:"+al_unpl);
		

	}

}
