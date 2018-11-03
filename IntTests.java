/*
 * find the missing number in a given integer array of 1 to 100?
 */

import  java.util.Arrays;
import java.util.BitSet;

public  class IntTests {
    static  int     findMissingNumberInIntArray( int[] arr ) {
        Arrays.sort( arr );
        for( int i = 1; i <= arr.length; i++ )
            if ( i != arr[i-1] )
                return i;

            return 0;
    }

    static  int[]   findMissingNumberInIntArrayBS( int[] arr ) {
        int     cnt = arr[ arr.length - 1 ];        // input array should be sorted and the last element is the greatest
        BitSet  bs = new BitSet( cnt );

        for( int i = 0; i < arr.length; i++, cnt-- ) {
            bs.set( arr[i] - 1 );
        }

        // now cnt is equal to number of zeros (missing numbers in bitset)

        int[]   rarr = new int [ cnt ];

        for (int i = bs.nextClearBit(0), j=0; i >= 0; i = bs.nextClearBit(i+1), j++)
            rarr[j] = i;

        return rarr;
    }

    int main(String[] args, int argc) {
        return 0;
    }
}