public class algorithm{
    public static void main(String[] args) { 
        int [] A = {2,5,4,6,3};
        insertion_sort(A);
       for (int i = 0 ; i < A.length ; i++){
        System.out.print(A[i]+" ");
       }
    }
    public static void insertion_sort(int[]A)
    { 
        for(int i = 2 ; i < A.length; i++) 
        {
           int key = A[i];
           int j = i - 1;
           while(j > 0 && A[j] > key){
            A[j+1] = A[j];
            j = j - 1 ;
           }
           A[j+1] = key;
        }
    }
}