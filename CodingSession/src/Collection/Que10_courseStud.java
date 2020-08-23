/*An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>  
Create another map in which course id is a key and list of student objects of that */


package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Que10_courseStud {

	public static void main(String[] args) {
		
		Student5 st1=new Student5(1, "meera");
		Student5 st2=new Student5(2, "jeera");
		Student5 st3=new Student5(3, "seera");
		Student5 st4=new Student5(4, "reera");
		
		Course c1=new Course(101, "java");
		Course c2=new Course(102, "cpp");
		Course c3=new Course(103, "php");
		Course c4=new Course(104, "react");

		ArrayList<Course> courselist=new ArrayList<>();
		
		courselist.add(c1);
		courselist.add(c2);
		courselist.add(c3);
		courselist.add(c4);
		
		HashMap<Student5, ArrayList<Course>> hm1=new HashMap<>();
		
		hm1.put(st1, courselist);
		hm1.put(st2, courselist);
		hm1.put(st3, courselist);
		hm1.put(st4, courselist);
		
		ArrayList<Student5> studlist=new ArrayList<>();
		HashMap<Integer, ArrayList<Student5>> hm2=new HashMap<>();
		Integer co_id;
		
		Set<Entry<Student5, ArrayList<Course>>> en=hm1.entrySet();
		for(Entry<Student5, ArrayList<Course>> data:en)
		{
			ArrayList<Course> al_c=data.getValue();
			Student5 studinfo=data.getKey();
			//System.out.println(al_c);
			
			//Student5 studinfo=data.getKey();
			
			for(Course c_data:al_c)
			{
				 co_id=c_data.getCid();
				//hm2.put(co_id, studlist.add(studinfo));
			}	
			hm2.put(co_id, studlist.add(studinfo));
			//	studlist.add(studinfo);
				
				/*
				Set<Entry<Student5, ArrayList<Course>>> en2=hm1.entrySet();
				for(Entry<Student5, ArrayList<Course>> data2:en)
				{
					Student5 studinfo=data2.getKey();
					hm2.put(co_id, studlist.add(studinfo));
				}*/
				
			}
			
		}
		
	}

}
