import junit.framework.TestCase;

public class SalesItemTest extends TestCase {

    private SalesItem item;

    // Method ini otomatis dijalankan sebelum setiap test
    protected void setUp() {
        item = new SalesItem("Kamera", 2500000);
    }

    public void testGetName() {
        assertEquals("Kamera", item.getName());
    }

    public void testGetPrice() {
        assertEquals(2500000, item.getPrice());
    }

    public void testAddValidComment() {
        boolean result = item.addComment("Alice", "Bagus sekali", 5);
        assertTrue(result);  // harus berhasil
        assertEquals(1, item.getComments().size());
        assertEquals("Alice", item.getComments().get(0).getAuthor());
    }

    public void testAddInvalidComment() {
        boolean result = item.addComment("Bob", "Buruk", 10);
        assertFalse(result); // rating di luar batas (0–5)
        assertEquals(0, item.getComments().size());
    }
}
