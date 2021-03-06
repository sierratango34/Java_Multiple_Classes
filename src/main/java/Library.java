import java.util.ArrayList;

public class Library {

    public ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        if (this.countBooks() + 1 > this.getCapacity()) return;
        this.books.add(book);
    }

    public Book removeBook() {
        if (this.getCapacity() == 0) return null;
        Book removedBook = this.books.remove(0);
        return removedBook;
    }

    public int countBooks() {
        return this.books.size();
    }

    public int getCapacity() {
        return this.capacity;
    }


}
