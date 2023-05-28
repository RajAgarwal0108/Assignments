package Assignment1;


// <aside>
// 💡 **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// **Example 1:**
// Input: nums = [1,3,5,6], target = 5

// Output: 2

// </aside>

public class arrays3 {

    int searchElement(int[] ar , int element){
        int n = ar.length;
        int index = 0;
        for(int i=0;i<n;i++){
            if(ar[i] == element){
                index = i;
            }
            else if(ar[i]>element){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int ar[] = {1,3,4,8,9,16};
        arrays3 ob = new arrays3();
        int element = 15;
        System.out.println(ob.searchElement(ar,element));

    }
}
