package models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BookTest {
    //G
    @Test
    public void test2EqualBooks() {
        Book book1 = new Book(1, "Learning Java", "Author", "12345", "Main Branch", 100);
        Book book2 = new Book(1, "Learning Java", "Author", "12345", "Main Branch", 100);

        // Kontrollera att equals fungerar
        assertEquals(book1, book2, "Books with the same data should be equal");
    }
    //G
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book(1, "Learning Java", "Author", "12345", "Main Branch", 100);
        Book book2 = new Book(2, "Learning Python", "Another Author", "67890", "Side Branch", 150);

        assertNotEquals(book1, book2, "Books with different data should not be equal");
    }
}
