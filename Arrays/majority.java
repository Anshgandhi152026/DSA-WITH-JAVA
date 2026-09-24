


// This is brute force approach to solve the problem

// public class majority{
//     public static int majorityelement(int arr[]){
//         int n = arr.length;

//         for(int i = 0; i<n; i++){
//             int count = 0;
//             for(int j = 0; j<n; j++){
//                 if(arr[j] == arr[i]){
//                     count++;
//                 }


//                 if(count>n/2){
//                     return arr[i];
//                 }
//             }
//         }
//         return -1; // if no majority element present
//     }


//     public static void main(String[] args) {
//         int arr[] = {2,2,3,3,1,2,2};
//         int ans = majorityelement(arr);
//         System.out.println("The majority element in array is: "+ans);
//     }
// }



// time complexity is o(n2)




// by using optimize  complexity o(n)

public class majority{
    public static int majorityelement(int arr[]){
        int n = arr.length;

        int freq = 0;
         int ans = 0;
         for(int i = 0; i<n; i++){
            if(freq == 0){
                ans = arr[i];
            }

            if(ans == arr[i]){
                freq++;
            }
            else{
                freq--;
            }
         }
         return ans;

    }
    public static void main(String[] args){
        int arr[] = {2,2,3,3,1,2,2};
        int ans = majorityelement(arr);
        System.out.println("The majority element is : "+ans);
    }
}


