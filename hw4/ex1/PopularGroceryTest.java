package hw4.ex1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PopularGroceryTest {

    private PopularGrocery popularGrocery;

    @BeforeEach
    public void setUp() {
        // Initialize a PopularGrocery object before each test
        popularGrocery = new PopularGrocery(5); // Assuming popularityLevel = 5
    }

    @Test
    public void testConstructor() {
        // Test if the constructor initializes the object correctly
        assertTrue(popularGrocery.isPopular, "The item should be marked as popular.");
        assertEquals(5, popularGrocery.popularityLevel, "The popularity level should be 5.");
    }

    @Test
    public void testSetQuantity() {
        // Test the setQuantity method
        popularGrocery.setQuantity(10);
        assertEquals(10, popularGrocery.quantity, "The quantity should be set to 10.");
    }

    @Test
    public void testShowWarning() {
        // Test the showWarning method
        popularGrocery.setQuantity(2);
        popularGrocery.householdLimit = 5; // Assuming householdLimit is accessible or settable
        assertTrue(popularGrocery.showWarning(), "Warning should be shown when quantity is below household limit.");

        popularGrocery.setQuantity(6);
        assertFalse(popularGrocery.showWarning(),
                "Warning should not be shown when quantity is above household limit.");
    }

    @Test
    public void testGetBulkDiscount() {
        // Test the getBulkDiscount method
        assertThrows(UnsupportedOperationException.class, () -> {
            popularGrocery.getBulkDiscount();
        }, "Calling getBulkDiscount should throw an UnsupportedOperationException.");
    }
}
<!-- Add your dependencies here -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>