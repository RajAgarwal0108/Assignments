package Assignment1;

// <aside>
// 💡 **Q5.** You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// **Example 1:**
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]

// **Explanation:** The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

// </aside>

public class arrays5 {
    void giveSpace(int[] ar, int index){
        System.out.println("giving space...");
        for(int i=ar.length-2;i>=index;i--){
            ar[i+1] = ar[i];
            System.out.println(ar[i]);
        }

    }
    void mergeArrays(int[] ar1, int[] ar2, int m, int n){
        for(int i=0;i<n;i++){
            int ele = ar2[i];
            System.out.println("element:"+ele);
            for (int j=0; j<m+n;j++) {
                if (ar1[j]>ele){
                    giveSpace(ar1, j);
                    ar1[j] = ele;
                    break;
                }
                if(ar1[j] == 0){
                    ar1[j] = ele;
                    break;

                }
                
                }

            } 
            System.out.println("---------array----------");
            for(int k=0;k<m+n;k++)
                System.out.print(ar1[k]+" ,");
        
    }
    
    public static void main(String[] args) {
        arrays5 ob = new arrays5();
        int ar1[] = {1,2,3,0,0,0};
        int ar2[] = {2,5,6};
        int m =3, n= 3;
        ob.mergeArrays(ar1, ar2, m, n);
    }
}
