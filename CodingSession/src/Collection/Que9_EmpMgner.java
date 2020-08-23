/*Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp and print all Employee 
along with their Manager name.*/

package Collection;

import java.util.ArrayList;

public class Que9_EmpMgner {

	public static void main(String[] args) {
		Employee emp1=new Employee(1, "uday", 11);
		Employee emp2=new Employee(2, "tom", 12);
		Employee emp3=new Employee(3, "viren", 1);
		Employee emp4=new Employee(4, "anay", 2);
		Employee emp5=new Employee(5, "rehan", 2);
		
		ArrayList<Employee> al1=new ArrayList<>();
		
		al1.add(emp1);
		al1.add(emp2);
		al1.add(emp3);
		al1.add(emp4);
		al1.add(emp5);
		
		for(Employee data:al1)
		{
			//String empnm=data.getName();
			int empid=data.getId();
			
			
			for(Employee data2:al1)
			{
				int mgid=data2.getMgnid();
			if(empid==mgid)
			{
				System.out.println(data.getName()+": Manager"+" - "+data2.getName()+": Employee");
			}
			
			}
		}

	}

}


// viren:uday.................rehan:tom..........anay:tom
