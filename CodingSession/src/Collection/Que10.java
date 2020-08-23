/*Consider an array of Student 
Student (int sid, String sname, List<String> hobby)
From this list create a Map<String,List<Student>> where key is hobby name and list of
student objects having same hobby. Also find out most common hobby among students
 * */



package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Que10 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		//al.add("dancing");
		//al.add("singing");
		al.add("painting");
		
		ArrayList<String> al2=new ArrayList<>();
		//al2.add("travelling");
		//al2.add("singing");
		al2.add("painting");
		
		ArrayList<String> al3=new ArrayList<>();
		al3.add("reading");
		//al3.add("singing");
		//al3.add("painting");
		
		Student s1=new Student(1, "ram", al);
		Student s2=new Student(2, "mohan", al2);
		Student s3=new Student(3, "rina", al3);
		
		HashMap<String , Student> hm=new HashMap<>();
		
		Set<Entry<String, Student>>ss=hm.entrySet();
		
		//Iterator<Entry<String, Student>> itr= ss.iterator();
		
		for(Entry<String, Student> data:ss)
		{
			for(String hh:s1.getAl())
			{
				String hobby=hh;
				if(hobby==Student.)
				Student st=s1.g
				hm.put(hobby, s1);
			}
		}
			
		}
		
		
		
		
		
		
		

}
