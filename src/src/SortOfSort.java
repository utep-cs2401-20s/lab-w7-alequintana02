public class SortOfSort {
    private void sortOfSort(int[]array) {
        int count = 0;
       // boolean sort;
            for (int i =0; i< array.length - 1;i++) {//bubble sort to put largest element at end
                for (int j = 0; j < array.length -i- 1; j++) {
            //   while (count == 2) {
                    if (array[i] >= array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
               //        count++;
                       //sort=true;
                    }//ends if
                    if (array[i]<=array[j]){
                       int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
              //  }  //ends while
                    }//ends j for
            }//ends i for
    //}//closes SOS
        //take into account duplicates and negative numbers

   // }//closes for loop
   }//closes SOS method
}//closes SOS class
