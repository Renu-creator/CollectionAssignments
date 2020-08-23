/*There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
Book { int bookid , String author , float price } 
There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. Write a program to update map using
new information in given array. If book is present in map calculate its business amount (price
* copiessold) and add to existing amount in map. If book is not present add its entry in map.*/

package Collection;

import java.util.HashMap;

public class Book {
	int bookid;
	String 	author;
	double price;

	Book(int bookid,String author,double d)
	{
		this.bookid=bookid;
		this.author=author;
		this.price=d;
		
	}
	
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", author=" + author + ", price=" + price + "]";
	}
	
	

	public static void main(String[] args) {
		
		
		/**/
		
		

	}

}
