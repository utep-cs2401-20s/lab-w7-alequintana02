import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTest {
    @Test
    public void test1() {
        int[]array1={2,7,1,3,0,9,6,5};//given code in read me
        SortOfSort test = new SortOfSort();
        int[]tester={6,5,1,0,2,3,7,9};
        assertArrayEquals(array1,tester);
    }//ends test1s

    @Test
    public void test2() {
        int[]array2={2,7,1,-3,0,-1,6,5};//has negative values
        SortOfSort test = new SortOfSort();
        int[]tester={5,2,-1,-3,0,1,6,7};
        assertArrayEquals(array2,tester);
    }//ends test2

    @Test
    public void test3() {
        int[]array3={2,2,1,1,0,9,6,5};//has duplicates
        SortOfSort test = new SortOfSort();
        int[]tester={5,2,1,0,1,2,6,9};
        assertArrayEquals(array3,tester);
    }//ends test3

    @Test
    public void test4() {
        int[]array4={2,7,-1,3,2,9,6,5};//has duplicates and negative values
        SortOfSort test = new SortOfSort();
        int[]tester={6,5,2,-1,2,3,7,9};
        assertArrayEquals(array4,tester);
    }//ends test4
    @Test
    public void test5() {
        int[]array5={-3,-5,-1,0,1,5,3,7};
        SortOfSort test = new SortOfSort();
        int[]tester={3,1,-3,-5,-1,0,5,7};
        assertArrayEquals(array5,tester);
    }//ends test5
}//ends tester class