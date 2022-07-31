
 
public class MissingArrayElements
{
 
    public static void main(String[] args) {
 
        int[] a1={7,3,6,1,4,2};
        System.out.println("Missing number from array arr1: "+missingNumber(a1));
        int[] a2={4,3,1,2};
        System.out.println("Missing number from array arr2: "+missingNumber(a2));
 
    }
 
    public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}
 