public class maxsuffix{
    public static void suffixmax(int arr[]){
        int n = arr.length;
        int suffix[] = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] = Math.max(suffix[i+1],arr[i]);
        }
        for(int i = 0; i<n; i++){
            System.out.print(suffix[i]+" ");
        }

    }


    public static void main(String[] args) {
        int arr[] = {5,2,3,10,1};
        suffixmax(arr);
    }
}