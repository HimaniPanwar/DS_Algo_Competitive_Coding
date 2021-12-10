//Program to find missing and repeating number in an array

public class findMissingAndRepeatingNumber{

    public static void printMissingAndRepeating(int[] arr,int n){
        int[] temp = new int[arr.length+1];

        for(int i=1;i<=n;i++){
            //System.out.println("in here:"+i);
            if(temp[arr[i-1]] == 0)
                temp[arr[i-1]] = 1;
            else 
                System.out.println("Repeating number:"+temp[arr[i-1]]);
        }

        for(int i=1;i<=n;i++){
            //System.out.println(temp[arr[i-1]]);
            if(temp[i] != 1){
                System.out.println("Missing number:"+i);
            }
        }
    }
    public static void main(String[] args) {
        int[] num = {4,3,6,2,1,1};
        int n = num.length;
        printMissingAndRepeating(num,n);
    }
}

//Problem Link: https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
// Time complexity : O(n), Space complexity : O(n)