public class SortOfSort {
    private void sortOfSort(int[]array) {
        int temp;//temporary variable for swap
        //take into account duplicates and negative numbers
        //for(int i=1;i<array.length;i++){//insertion sort
        //j=1
        // while(j>0 && array[i]<array[j-1]){
        //temp=array[j];
        //array[j]=array[j-1];
        //array[j-1]=temp;
        //j--;
    //}ends insertion sort
       for(int i=array.length-1;i>=0;i--){//bubble sort to put largest element at end
           if (array[i]>array[+1]) {
               temp = array[i];
               array[i] = array[i + 1];
               array[i + 1] = temp;
           }
    }//closes for loop
    }//closes SOS method
}
