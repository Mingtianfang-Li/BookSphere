package booksphere.model;

public class Book {
    private long bookID;
    private String isbn;
    private String title;
    private int authorID;
    private int bookYear;
    private int publisherID;
    private BookType bookType;
    
    public Book() {
    }
    
    public Book(String isbn, String title, int authorID, int bookYear, int publisherID, BookType bookType) {
        this.isbn = isbn;
        this.title = title;
        this.authorID = authorID;
        this.bookYear = bookYear;
        this.publisherID = publisherID;
        this.bookType = bookType;
    }
    
    public long getBookID() {
        return bookID;
    }
    
    public void setBookID(long bookID) {
        this.bookID = bookID;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getAuthorID() {
        return authorID;
    }
    
    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }
    
    public int getBookYear() {
        return bookYear;
    }
    
    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
    
    public int getPublisherID() {
        return publisherID;
    }
    
    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }
    
    public BookType getBookType() {
        return bookType;
    }
    
    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
    
    // toString() method
    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authorID=" + authorID +
                ", bookYear=" + bookYear +
                ", publisherID=" + publisherID +
                ", bookType=" + bookType +
                '}';
    }
}

// Enum for BookType
enum BookType {
    FICTION,
    NON_FICTION,
    MYSTERY,
    THRILLER,
    ROMANCE,
    SCIENCE_FICTION,
    FANTASY,
    HISTORICAL_FICTION,
    BIOGRAPHY,
    AUTOBIOGRAPHY,
    SELF_HELP,
    PHILOSOPHY,
    TRAVEL,
    MEMOIR,
    POETRY,
    DRAMA,
    HORROR,
    COMEDY,
    ADVENTURE,
    YOUNG_ADULT,
    CHILDREN_LITERATURE,
    SATIRE,
    GRAPHIC_NOVEL,
    ESSAY,
    COOKBOOK,
    SCIENCE,
    TECHNOLOGY,
    PSYCHOLOGY,
    SOCIOLOGY,
    ANTHROPOLOGY
}