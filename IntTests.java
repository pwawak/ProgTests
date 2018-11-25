/*
 * find the missing number in a given integer array of 1 to 100
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public  class IntTests {
    static  int     findMissingNumberInIntArray( int[] arr ) {
        Arrays.sort( arr );
        for( int i = 1; i <= arr.length; i++ )
            if ( i != arr[i-1] )
                return i;

            return 0;
    }

// -------------------------------------------------------------
    
    static  int[]   findMissingNumberInIntArrayBS( int[] arr ) {
        int     cnt = 1 + arr[ arr.length - 1 ];        // input array should be sorted and the last element is the greatest
        BitSet  bs = new BitSet( cnt );

        for( int i = 0; i < arr.length; i++, cnt-- ) {
            bs.set( arr[i] );
        }

        // now cnt is equal to the number of zeros (missing numbers in bitset)

        int[]   rarr = new int [ cnt ];

        for (int i=0, j=0; j < rarr.length; i++, j++) {
        	i = bs.nextClearBit(i);
        	if( i < 0 )
        		break;
        	rarr[j] = i;
        }

        return rarr;
    }
    
// -------------------------------------------------------------
    
    
    static  ArrayList<Integer>    findDuplicateNumberInIntArray( int[] arr ) {
    	
    	ArrayList<Integer>	retArr = new ArrayList<Integer>();
    	BitSet				bs     = new BitSet();
    	
    	for( int i = 0; i < arr.length; i++ ) {
        	if( ! bs.get( arr[i] ))
        		bs.set( arr[i] );
        	else
        		retArr.add( arr[ i ] );
        		
        }
    	
        return	retArr;
    }

// -------------------------------------------------------------
    
    int main(String[] args, int argc) {
        return 0;
    }
}