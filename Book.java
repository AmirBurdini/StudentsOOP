public class Book {
    
    public String id;
    private String name;
    private Author author;
    private int price;

    public Book(String id, String name, Author author, int price) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean sameAuthor(Book b) {

        return (author.getName().equals(b.getAuthor().getName()));
    }
}
