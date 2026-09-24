public class peak {

    public static int findPeak(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left<right){
            int mid = left + (right - left)/2;
            if(arr[mid]>arr[mid + 1]){
                // means peak element lies on mid or mid ka left par
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1};
        int ans = findPeak(arr);
        System.out.println("The peak element is : "+arr[ans]);
        System.out.println("The peak element index is : "+ans);
    }
}
