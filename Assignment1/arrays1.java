package Assignment1;


/**
 <aside>
💡 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example:**
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]

**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][

</aside>
 */
public class arrays1 {
    int[] indexOfSum(int[] ar,int target){
        int n = ar.length;
        int left = 0,right = n-1;
        while(left != right){
            if((ar[left] + ar[right] )== target){
                break;
            }
            else if((ar[left] + ar[right] )> target){
                right --;
            }
            else{
                left++;
            }
        }
        // System.out.println(left);
        // System.out.println(right);
        int returnObject[] = {left,right};
        return returnObject;
    }
    public static void main(String[] args) {

        int ar[] = {2,17,7,11,15};
        arrays1 ob = new arrays1();
        int target = 9;
        int outputArray[]= ob.indexOfSum(ar, target);
        for(int i=0;i<=1;i++){
            System.out.print(outputArray[i]+",");
            
        }
        System.out.println();

    }
    
}