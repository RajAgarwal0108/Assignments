package Assignment1;

// <aside>
// 💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

// Note that you must do this in-place without making a copy of the array.

// **Example 1:**
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// </aside>

public class arrays7 {
    void moveElementToEnd(int index,int[] ar){
        int n = ar.length;
        int temp;
        for(int i=index;i<n-1;i++){
            temp = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = temp;
        }

    }
    int [] returnArray(int ar[]){
        int n = ar.length;
        for(int i = 0;i<n;i++){
            if(ar[i] == 0){
                moveElementToEnd(i, ar);
            }
        }
        return ar;
    }
    
    public static void main(String[] args) {
        arrays7 obj = new arrays7();
        int ar[] = {0,1,0,3,12};
        int array[] = obj.returnArray(ar);
        for (int i : array){
            System.out.println(i);
        }
    }
}
