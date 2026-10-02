public class bookallocation {
    public static boolean isValid(int arr[],int mid,int k){
        // Check whether mid or maxpages is a valid solution or not 
        int student = 1;
        int pages = 0;
        for(int i = 0; i<arr.length; i++){
            if(pages + arr[i] <= mid){
                // is matlab current book can be assigned
                // as it is not out of limit
                pages = pages + arr[i];
            }
            else{
                // current book  current student ko cannot
                // assigned vala case
                
                // matlab is bache ko book assigned nahi kar sakte ha to new bache ko assign karo 
                student++;
                // ye be check karna ha ki agar student count > k vo case valid nahi ha
                if(student>k || arr[i]>mid){
                    return false;
                }
                else{
                    // can assigned to new student
                    pages = 0; // starting me pages 0 ha
                    pages = pages + arr[i];
                }

            }
        }
        return true;

    }

    public static int bookAllocate(int arr[],int k){
        int st = 1;
        int sum = 0;
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        int end = sum;

        while(st<=end){
            int mid = st + (end - st)/2;
            if(isValid(arr, mid, k)){
                ans = mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {12,34,67,90};
        int k = 2;
        System.out.println(bookAllocate(arr, k));
    }
}
