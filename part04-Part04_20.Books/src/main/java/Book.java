public class Book {

    private String title;
    private int page;
    private int yearPublished;

    public Book(String title, int page, int yearPublished){
        this.title = title;
        this.page = page;
        this.yearPublished = yearPublished;
    }

    public String getName(){
        return this.title;
    }

    public String toString(){
        return this.title + ", " + this.page + " pages, " + this.yearPublished;
    }
    
}
