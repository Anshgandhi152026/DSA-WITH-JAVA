public class singlenumber{
    public static boolean containsdupicate(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        System.out.println(containsdupicate(arr));
    }
}