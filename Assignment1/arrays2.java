package Assignment1;

// <aside>
// 💡 **Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// - Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// - Return k.

// **Example :**
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_*,_*]

// **Explanation:** Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores)

// </aside>

public class arrays2 {
    int removeOccurence(int[] ar, int value){
        int temp;
        int n = ar.length;
        int left =0, right = n-1;
        while(left!=right){
            if(ar[left] == value){
                if(ar[right] != value){
                    temp = ar[right];
                    ar[right] = ar[left];
                    ar[left] = temp;
                    left++;
                    right --;
                }
                else if(ar[right] == value){
                    right --;
                }

            }
            else{
                left++;
            }
        }
        return left+1;
    }
    public static void main(String[] args) {
        arrays2 ob = new arrays2();
        int ar[] = {3,2,2,3};
        int value = 3;
        int k = ob.removeOccurence(ar, value);
        System.out.println(k);
    }
    
}
