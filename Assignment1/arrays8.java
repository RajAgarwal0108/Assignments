package Assignment1;

// <aside>
// 💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// **Example 1:**
// Input: nums = [1,2,2,4]
// Output: [2,3]

// </aside>

public class arrays8 {

    int [] getMissingElement(int ar[]){
        int newArray [] = new int [2];
        for(int i=0;i<ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                newArray[0] = ar[i];
                newArray[1] = ar[i]+1;
                break;
            }
        }
        return newArray;
    }
    
    public static void main(String[] args) {
        arrays8 obj = new arrays8();
        int ar[] = {1,2,3,4,4,5};
        int ans [] = obj.getMissingElement(ar);
        for (int i : ans) {
            System.out.println(i);
        }

    }
}
