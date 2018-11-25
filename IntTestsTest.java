import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class IntTestsTest {
    @Test
    void FindingMissingNumbersTest() {
        assertEquals(5, IntTests.findMissingNumberInIntArray( new int[] {1, 2, 3, 4, 6} ) );
        assertEquals(5, IntTests.findMissingNumberInIntArray( new int[] {1, 2, 3, 4, 6, 7, 9, 8, 10} ) );
        assertEquals(5, IntTests.findMissingNumberInIntArray( new int[] {1, 2, 3, 4, 6, 9, 8} ) );
        assertEquals(5, IntTests.findMissingNumberInIntArray( new int[] {1, 2, 3, 4, 8, 9} ) );

        assertArrayEquals(new int[] { 0, 5 }, IntTests.findMissingNumberInIntArrayBS( new int[] {1, 2, 3, 4, 6} ) );
        assertArrayEquals(new int[] { 0, 5, 6, 7 }, IntTests.findMissingNumberInIntArrayBS( new int[] {1, 2, 3, 4, 8} ) );
        assertArrayEquals(new int[] { 0 }, IntTests.findMissingNumberInIntArrayBS( new int[] { 1 } ) );
    }
    
    @Test
    void findDuplicateNumbersTest() {
    	ArrayList<Integer>	al = new ArrayList<Integer>();
    	
    	al.add( new Integer(2) );
    	assertEquals( al, IntTests.findDuplicateNumberInIntArray( new int[] { 1, 2, 2, 4 } ) );
    	
    	al.clear();
    	
    	al.add( new Integer(2) );
    	al.add( new Integer(7) );
    	assertEquals( al, IntTests.findDuplicateNumberInIntArray( new int[] { 1, 2, 2, 4, 7, 7 } ) );
    	
    	al.clear();
    	assertEquals( al, IntTests.findDuplicateNumberInIntArray( new int[] { 1, 2, 3, 4, 6, 7 } ) );
    }
}