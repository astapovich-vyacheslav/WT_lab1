//task 13
public class ProgrammerBook extends Book {
	
	private String language;
	private int level;
	
	private String title;
	private String author;
	private int price;
	private int edition;
	
	ProgrammerBook(String title, String author, int price, int edition, String language, int level) {
		super(title, author, price, edition);	
		this.title = this.getTitle();
		this.author = this.getAuthor();
		this.price = this.getPrice();
		this.edition = this.getEdition();
		this.language = language;
		this.level = level;
	}
	
	@Override
	public boolean equals(Object obj) {		
		if (obj == this) {
            return true;
        } 
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        } 
        ProgrammerBook objBook = (ProgrammerBook)obj; 
        return (objBook.getTitle() == this.title) && (objBook.getAuthor() == this.author) &&
		(objBook.getPrice() == this.price) && (objBook.getEdition() == this.edition);
	}
	
	@Override
	public int hashCode() {
		int h1 = title == null ? 0 : title.hashCode();
		int h2 = author == null ? 0 : author.hashCode();
		int h3 = language == null ? 0 : language.hashCode();
		int hash = h1 + h2 + price + edition + h3 + level;
		return hash;
	}
	
	@Override 
	public String toString() {
		return "Book: title = '" + title + "', author = '" + author + "', price = " + price +
        ", edition = " + edition + ", language = '" + language + "', level = " + level;
	}
	
	public static void main(String args[]) {
		
		ProgrammerBook programmerBook1 = new ProgrammerBook("C programming language", "Brian Kernigan", 40, 3, "C", 1);
		ProgrammerBook programmerBook2 = new ProgrammerBook("Head First Java", "Katy Sierra", 25, 2, "Java", 2);
		ProgrammerBook programmerBook3 = new ProgrammerBook("C programming language", "Brian Kernigan", 40, 3, "C", 1);
		
		System.out.println(programmerBook1.equals(programmerBook2));
		System.out.println(programmerBook1.equals(programmerBook3));
		
		System.out.println(programmerBook1.hashCode());
		
		System.out.println(programmerBook1.toString());		
	}
}