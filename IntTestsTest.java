import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IntTestsTest {
    @Test
    void FindingMissingNumbersTest() {
        assertEquals(5, IntTests.findMissingNumberInIntArray( new int[] {1, 2, 3, 4, 6} ) );
        assertEquals(5, IntTests.findMissingNumberInIntArray( new int[] {1, 2, 3, 4, 6, 7, 9, 8, 10} ) );
        assertEquals(5, IntTests.findMissingNumberInIntArray( new int[] {1, 2, 3, 4, 6, 9, 8} ) );
        assertEquals(5, IntTests.findMissingNumberInIntArray( new int[] {1, 2, 3, 4, 8, 9} ) );

        assertArrayEquals(new int[] { 5 }, IntTests.findMissingNumberInIntArrayBS( new int[] {1, 2, 3, 4, 6} ) );
    }
}