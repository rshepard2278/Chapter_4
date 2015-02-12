package src;

/**
 * @author Richard Shepard
 * @version Jan 28, 2015
 */

public class Book {

	private String lastName;
	private String firstName;
	private String title;
	private String pubDate;
	private int isbn;
	private int numPages;
	
	
	/**
	 * Instantiates a book objects by 
	 * prompting the user for the details
	 */
	public Book() {
		
	}
	
	/**
	 * @param lastName
	 * @param firstName
	 * @param title
	 * @param pubDate
	 * @param isbn
	 * @param numPages
	 * 
	 * Instantiates a book objects by 
	 * passing parameter for the details
	 */
	public Book(String lastName, String firstName, String title,
			String pubDate, int isbn, int numPages) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.title = title;
		this.pubDate = pubDate;
		this.isbn = isbn;
		this.numPages = numPages;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @return the pubDate
	 */
	public String getPubDate() {
		return pubDate;
	}
	
	
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}
	
	
	/**
	 * @return the numPages
	 */
	public int getNumPages() {
		return numPages;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String line1 = "Book informatin for " + title;
		String line2 = "=========================================";
		String line3 = "Title:                   " + title;
		String line4 = "Author:                  " + firstName + " " + lastName;
		String line5 = "ISBN#:                   " + isbn;
		String line6 = "Pages:                   " + numPages;
		String line7 = "Pub Date:                " + pubDate;
		
		String multilineString = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
				line1,line2,line3,line4,line5,line6,line7);
		return multilineString;
	}
}