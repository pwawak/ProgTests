/*
 * find the missing number in a given integer array of 1 to 100?
 */

import  java.util.Arrays;

public  class IntTests {
    int     findMissingNumberInIntArray( int[] arr ) {
        Arrays.sort( arr );
        for( int i = 0; i < arr.length; i++ )
            if ( i != arr[i] )
                return i;

            return 0;
    }

    int main(String[] args, int argc) {
        return 0;
    }
}