/*There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
Book { int bookid , String author , float price } 
There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. Write a program to update map using
new information in given array. If book is present in map calculate its business amount (price
* copiessold) and add to existing amount in map. If book is not present add its entry in map.*/

package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Booksale {
	Book b;
	int copiesSold;
	
	
	Booksale(Book b,int copiesSold)
	{
		this.b=b;
		this.copiesSold=copiesSold;
	}

	public Book getB() {
		return b;
	}



	public void setB(Book b) {
		this.b = b;
	}



	public int getCopiesSold() {
		return copiesSold;
	}



	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}



	@Override
	public String toString() {
		return "Booksale [b=" + b + ", copiesSold=" + copiesSold + "]";
	}



	public static void main(String[] args)
	{
		Book b1=new Book(101, "ram", 30.0);
		Book b2=new Book(102, "sam", 60.0);
		Book b3=new Book(103, "meera", 90.0);
		Book b4=new Book(104, "reena", 70.0);
		
		Booksale bb1=new Booksale(b1,100);
		Booksale bb2=new Booksale(b2,110);
		Booksale bb3=new Booksale(b3,120);
		Booksale bb4=new Booksale(b4,130);
		
		ArrayList<Booksale> al=new ArrayList<>();
		
		al.add(bb1);
		al.add(bb2);
		al.add(bb3);
		al.add(bb4);
		
		HashMap<Integer,Double> hm=new HashMap<>();
		
		hm.put(101,30.0);
		hm.put(102,60.0);
		hm.put(103,90.0);
		hm.put(104,60.0);
		
		for(Map.Entry<Integer, Double> en:hm.entrySet())
		{
			for(Booksale ob:al)
			{
				
				if(ob.b.bookid==en.getKey())
				{
					double amt=en.getValue()+(ob.b.price*ob.copiesSold);
					hm.put(en.getKey(),amt);
					//System.out.println("business amount= "+ob.b.price*en.getValue());
				}
				else
				{
					hm.put(ob.b.bookid,(ob.b.price*ob.copiesSold) );
				}
				
			}
			
			System.out.println(en.getKey()+"\t"+en.getValue());
			
		}
		
		
	}

}
