package Assignment1;

// <aside>
// 💡 **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// **Example 1:**
// Input: nums = [1,2,3,1]

// Output: true

// </aside>

public class arrays6 {

    boolean haveDuplicate(int[] ar){
        
        int n = ar.length;
        for(int i=0;i<n;i++){
            int flag =0;
            int element = ar[i];
            for(int j=0;j<n;j++){
                if (ar[j] == element)
                    flag ++;
            }
            if(flag>=2){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        arrays6 obj = new arrays6();
        int nums[] = {1,2,3,4,5,6,7,1};
        boolean haveDup = obj.haveDuplicate(nums);
        System.out.println(haveDup);

    }
    
}
