public class onlyprefixsum{
    public static void prefixsum(int arr[]){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.print("The prefix sum is: ");
        for(int i = 0; i<n; i++){
            System.out.print(prefix[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,3,7,1,8,20,30};
        prefixsum(arr);
        
    }
}


