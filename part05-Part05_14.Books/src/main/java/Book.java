
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        //if the compared object is not of type Book, the objects are not equal
        if(!(compared instanceof Book)){
            return false;
        }

        //Convert the object to a book object
        Book comparedBook = (Book) compared;
        //if the value of the object variables are equal, the objects are, too
        if(this.name.equals(comparedBook.name)&&this.publicationYear == comparedBook.publicationYear){
            return true;
        }
        return false;
    }

}
