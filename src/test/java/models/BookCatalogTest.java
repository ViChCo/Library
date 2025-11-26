package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        Book book2 = new Book(2, "Python Basics", "Author", "12345", "IT", 150);
        bc.addBook(book2);
        assertEquals(2, bc.getNumberOfBooks());

        try {
            Book found = bc.findBook("Python Basics");
            assertEquals(book2, found);
        } catch (BookNotFoundException e) {
            fail("The newly added book should be found");
        }
    }


    //G
    @Test
    public void testFindBook() {
        try {
            Book b = bc.findBook("Learning Java");
        } catch (BookNotFoundException e) {
            fail("Book should have been found");
        }
    }

    //G
    @Test
    public void testFindBookIgnoringCase() {
        try {
            Book b = bc.findBook("learning java");
        } catch (BookNotFoundException e) {
            fail("Book should have been found ignoring case");
        }
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {
        try {
            Book b = bc.findBook("  Learning Java  "); // extra spaces
        } catch (BookNotFoundException e) {
            fail("Book should have been found ignoring extra spaces");
        }
    }
}
