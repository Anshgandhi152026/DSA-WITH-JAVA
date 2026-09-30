public class kthmissing{

    public static int kmissing(int arr[],int k){
        int n = arr.length;
        // step first find the missing number using binary search
        int left = 0;
        int right = n - 1;
        while(left<=right){
            int mid = left + (right - left)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }

        }
        return left + k;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,11};
        int k = 5;
        int ans = kmissing(arr, k);
        System.out.println("The kth missing element is : "+ans);
    }
}