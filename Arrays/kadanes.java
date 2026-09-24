

// public class kadanes{
//     public static void kadanemaxsum(int arr[]){
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;


//         for(int i = 0; i<arr.length; i++){
//             currsum = currsum + arr[i];
//             if(currsum<0){  // if currsum is negative currsum ko zero banado
//                 currsum = 0;
//             }

//             maxsum = Math.max(currsum,maxsum);
//         }


//         System.out.println("The max subarray sum using kadanes is : "+maxsum);
//     }

//     public static void main(String[] args) {
//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//         kadanemaxsum(arr);
//     }
// }




public class kadanes {
    public static void kadanemaxsum(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int maxelement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];

            if (currsum < 0) { // jaha bhi current sum me negative value aa gyi us case me currsum ko zero banado 
                currsum = 0;
            }

            maxsum = Math.max(currsum, maxsum);
            maxelement = Math.max(maxelement, arr[i]);
        }        // if all elements are negative
        if (maxelement < 0) {
            System.out.println("The maximum subarray sum using kadanes is: " + maxelement);
            return;
        }

        System.out.println("The maximum subarray sum using kadanes is: " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        kadanemaxsum(arr);        
    }
}
