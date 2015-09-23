public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyRightDate;

    // Book object
    public Book(String bookTitle, String authorName, 
    		String publisherName, int date) {
        title = bookTitle;
        author = authorName;
        publisher = publisherName;
        copyRightDate = date;
    }
    // Accessor & Mutator methods (Getters & Setters)
    public void setAuthor(String authorName) { // set author
        author = authorName; 
    }
    public String getAuthor() { // get author
        return author; 
    }
     public void setTitle(String bookTitle) { // set title
        title = bookTitle; 
    }
    public String getTitle() { // get title
        return title; 
    }
    public void setPublisher(String publisherName) { // set publisher name
        publisher = publisherName; 
    }
    public String getPublisher() { // get publisher name
        return publisher;
    }
    public void setCopyRightDate(int date) {  // set copyright date 
        copyRightDate = date; 
    }
    public int getCopyRightDate() {  // get copyright date 
    	return copyRightDate; 	
	}
       
    public String toString() { // Concatenate to string
       return (title + author + publisher + copyRightDate + "\n");
    }
}



