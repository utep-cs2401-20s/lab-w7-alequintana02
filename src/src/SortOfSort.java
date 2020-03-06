public class SortOfSort {
    public static void sortOfSort(int[]array) {
        int lengthMax = array.length-1;
        int toBegin = 0; //where we want to begin our index search
        int indexOfMax = 0;//holder for the index of the max value
        int count = 0;
        //take into account duplicates and negative numbers!!!!

///////we only traverse up to array.length-1/////
            while (toBegin < lengthMax) {
                int max = array[toBegin];

                for (int i = toBegin; i <= lengthMax; i++) {
                    if (array[i] >= max) {//finds new maximum
                        max = array[i];
                        indexOfMax = i;
                    }//closes if
                }//closes for loop
///////////these next 2 statements apply a binary search-type algorithm//////
//the following website was used to help: https://www.geeksforgeeks.org/java-program-for-binary-search-recursive-and-iterative/
                //if what we are looking for is in the left subarray//
                if (count % 4 < 2 ) {
                    int temp = array[lengthMax];
                    array[lengthMax] = max;
                    array[indexOfMax] = temp;
                    lengthMax--;//we now ignore the right half
               //else: the element is in the right subarray
                } else {
                    int temp = array[toBegin];
                    array[toBegin] = max;
                    array[indexOfMax] = temp;
                    toBegin++;//we now ignore the left half
                }//closes else
               count++;//increases the count after each pass
            }//closes while loop
   }//closes SOS method
}//closes SOS class
