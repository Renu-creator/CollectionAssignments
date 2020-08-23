/*Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .
 * Create a Set<Student> Student{sid,totalmarks}  from the list and sort the set in descending order
 *  of totalmarks*/

package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Que16 {
	
//	int a[]=new int[]{2,3,4};

	public static void main(String[] args)
	{
		int m1[]=new int[]{50,60,70};
		int m2[]=new int[]{70,50,40};
		int m3[]=new int[]{90,80,70};
		
		Test t1=new Test(1, 111,m1);
		Test t2=new Test(2, 122,m2);
		Test t3=new Test(3, 133,m3);
		
		HashSet<Student3> hs=new HashSet<>();
		ArrayList<Test>	al=new ArrayList<>();
		
		al.add(t1);
		al.add(t2);
		al.add(t3);
		
		int totalmarks=0;
		
		for(Test data:al)
		{
			int arr[]=data.marks;
			
			for(int i=0;i<arr.length;i++)
			{
				totalmarks=totalmarks+arr[i];
					
			}
			hs.add(new Student3(data.getSid(), totalmarks));
			totalmarks=0;
					
		}
		
		
		for(Student3 studdata:hs)
		{
		System.out.println(studdata);
		}
		
		System.out.println("----------------------------------");
		System.out.println();
		ArrayList<Student3> al_stud =new ArrayList<>(hs);
		
		Collections.sort(al_stud);
		
		for(Student3 stu:al_stud)
		{
			System.out.println(stu);
		}
		

	}



}
