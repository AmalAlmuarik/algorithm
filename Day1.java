// problem 1 , Day 1 
/*
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, 
 * return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * Analyzing the problem 
 * input  : int SORTED Array , target value
 * process: search for the value , extract the index 
 * output : index of the value 
 *
 */
public class Day1 { 
    public static void main(String[] args)
    { 
        int [] a = {-1,3,5,6};
        int result = binary_searchInsert(a , 0);
        System.out.print("Result is : "+ result);

    }
    // time complexity O(n)
    // space complexity O(n) 
    public static int searchInsert(int[] A , int target) { 
        int target_index = -1; // 1 unit
        for (int i = 0 ; i < A.length ; i++) // n + 1
        { 
            if(A[i] == target){ // n
                target_index = i; // n
                break; // n
            }
        }
        return target_index; // 1 unit
    }
    // time complexity O(log n)
    // space complexity O(1)
    public static int binary_searchInsert(int[] A , int target){ 
        // <low-------->mid>---------high>
        int low = 0;
        int high = A.length - 1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(A[mid] > target) // whoa! step back 
                high = mid - 1;
            else if(A[mid] < target) // don't be afraid GO BIG!
                low = mid +1;
            else 
                return mid; // not less nor greater it must be equal
        }
        // value not in A , predict the place
        // case 1 : the value greater than any value present 
        if(target > A[A.length-1])
            return A.length;
        // case 2 : the value 
        return low;
        
    }
}