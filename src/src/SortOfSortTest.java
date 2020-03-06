import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTest {
    @Test
    public void test1() {
        //testing this because it was the given code in read me
        int[]array1={2,7,1,3,0,9,6,5};
        int[]correct={6,5,1,0,2,3,7,9};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(array1);
        assertArrayEquals(correct,array1);
    }//ends test1

    @Test
    public void test2() {
        //testing this because it is all negative values and has negative duplicates
        int[]array2={-2,-7,-1,-3,0,-1,-6,-5};
        int[]correct={-1,-2,-6,-7,-5,-3,-1,0};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(array2);
        assertArrayEquals(correct,array2);
    }//ends test2

    @Test
    public void test3() {
        //testing this because it has duplicates
        int[]array3={2,2,1,1,0,9,6,5};
        int[]correct={5,2,1,0,1,2,6,9};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(array3);
        assertArrayEquals(correct,array3);
    }//ends test3

    @Test
    public void test4() {
        //testing this because it has positive duplicates AND negative values
        int[]array4={2,7,-1,3,2,9,6,5};
        int[]correct={6,5,2,-1,2,3,7,9};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(array4);
        assertArrayEquals(correct,array4);
    }//ends test4
    @Test
    public void test5() {
        //testing this because it has negative values
        int[]array5={-3,-5,-1,0,1,5,3,7};
        int[]correct={3,1,-3,-5,-1,0,5,7};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(array5);
        assertArrayEquals(correct,array5);
    }//ends test5
}//ends tester class