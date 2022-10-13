import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//task 12, 14, 15
public class Book implements Comparable<Book> {
	
	private String title;
	private String author;
	private int price;
	private int edition;
	private Integer isbn;
	
	Book(String title, String author, int price, int edition, Integer isbn)
    {
		this.title = title;
		this.author = author;
		this.price = price;
		this.edition = edition;
		this.isbn = isbn;
	}
	
	Book()
    {

    }
	
	Book(String title, String author, int price, int edition)
    {
		this.title = title;
		this.author = author;
		this.price = price;
		this.edition = edition;
	}
	
	public void setTitle(String title) 
    {
        this.title = title;
    }

	public String getTitle() 
    {
        return title;
    }
	
	public void setAuthor(String author)
    {
        this.author = author;
    }

	public String getAuthor() 
    {
        return author;
    }
	
	public void setPrice(int price)
    {
        this.price = price;
    }

	public int getPrice() 
    {
        return price;
    }
	
	public void setEdition(int edition)
    {
        this.edition = edition;
    }

	public int getEdition() 
    {
        return edition;
    }
	
	public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }

	public int getIsbn() 
    {
        return isbn;
    }
	
	@Override
    public boolean equals(Object obj)
    {		
		if (obj == this) {
            return true;
        } 
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        } 
        Book objBook = (Book)obj; 
        return (objBook.getTitle() == this.title) && (objBook.getAuthor() == this.author) &&
		(objBook.getPrice() == this.price) && (objBook.getEdition() == this.edition) && (objBook.getIsbn() == this.isbn);
	}	
	
	@Override
	public int hashCode()
    {
		int h1 = title == null ? 0 : title.hashCode();
		int h2 = author == null ? 0 : author.hashCode();
		int hash = h1 + h2 + price + edition + isbn;
		return hash;
	}
	
	@Override 
	public String toString()
    {
		return "Book: title = '" + title + "', author = '" + author + "', price = " + price + ", edition = " + edition + ", isbn = " + isbn;
	}
	
	@Override
	public Object clone()
    {
		Book copy = new Book();
		copy.title = this.title;
		copy.author = this.author;
		copy.price = this.price;
		copy.edition = this.edition;
		return copy;
	}
	
	public int compareTo(Book book) 
    {
		return this.isbn - book.isbn;
	}
	
	public static void main(String args[]) 
    {
		
		ArrayList<Book> booksList1 = new ArrayList<Book>();
		Book b1 = new Book("Book1", "Author1", 10, 1, 273);
		Book b2 = new Book("Book2", "Author2", 15, 2, 594);
		Book b3 = new Book("Book2", "Author2", 15, 2, 594);
		
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		
		System.out.println(b1.hashCode());
		
		System.out.println(b2.toString());
		
		System.out.println(b3.clone());	
		
		booksList1.add(b1);
		booksList1.add(b2);
		booksList1.add(b3);
		System.out.println(booksList1);
		
		Comparator<Book> titleComp = new TitleComparator();
		Comparator<Book> titleauthorComp = new TitleComparator().thenComparing(new AuthorComparator());
		Comparator<Book> authortitleComp = new AuthorComparator().thenComparing(new TitleComparator());
		Comparator<Book> authortitlepriceComp = new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator());
		
		ArrayList<Book> booksList2 = new ArrayList<Book>();
		booksList2.add(new Book("Twilights", "Stefani Mayer", 25, 1, 833));
		booksList2.add(new Book("Loneliness on the web", "Yanush Vishnevsky", 20, 2, 725));
		booksList2.add(new Book("Singing in the thorns", "Colin McCallow", 45, 1, 880));
		booksList2.add(new Book("Pride and prejudice", "Jane Osten", 30, 2, 573));

		booksList2.sort(titleComp);
		System.out.println(Arrays.toString(booksList2.toArray()));
		booksList2.sort(titleauthorComp);
		System.out.println(Arrays.toString(booksList2.toArray()));
		booksList2.sort(authortitleComp);
		System.out.println(Arrays.toString(booksList2.toArray()));
		booksList2.sort(authortitlepriceComp);
		System.out.println(Arrays.toString(booksList2.toArray()));
	}
}