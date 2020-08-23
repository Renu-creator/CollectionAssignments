/*Ordering::
HashSet does not maintain any order while 
LinkedHashSet maintains insertion order of elements much like List interface and
TreeSet maintains sorting order or elements*/

/*Create two Set of students objects where insertion order in maintained. 
 * Now accept Studentid from user and check whether in both sets have student with given id 
 * at same position*/

package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Que13 {

	public static void main(String[] args) {
		
		Student6 s1=new Student6(11, "Veer");
		Student6 s2=new Student6(22, "Neer");
		Student6 s3=new Student6(33, "peer");
		Student6 s4=new Student6(44, "seer");
		
		
		LinkedHashSet<Student6> ls1=new LinkedHashSet<>();
		ls1.add(s1);
		ls1.add(s2);
		ls1.add(s3);
		ls1.add(s4);
		
		HashSet<Student6> ls2=new HashSet<>();
		ls2.add(s1);
		ls2.add(s2);
		ls2.add(s3);
		ls2.add(s4);

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the studid");
		
		int id=sc.nextInt();
		
		ArrayList<Student6> al=new ArrayList<>(ls1);
		int loc1 = 0;
		
		for(Student6 data:al)
		{
			int idfromset=data.getStudid();
			
			if(id==idfromset)
			{
				loc1=al.indexOf(idfromset);
			}
			else
			{
				System.out.println("not found");
			}
			
		}
		ArrayList<Student6> al2=new ArrayList<>(ls2);
		int loc2 = 0;
		
		for(Student6 data2:al2)
		{
			int idfromset=data2.getStudid();
			
			if(id==idfromset)
			{
				loc2=al2.indexOf(idfromset);
			}
			else
			{
				System.out.println("not found");
			}
			
		}
		
		
		if(loc1==loc2)
		{
			System.out.println("same position");
		}
		
		
	}

}
