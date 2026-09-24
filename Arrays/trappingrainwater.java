// public class trappingrainwater{
//     public static int trappedrainwater(int height[]){
//         int n = height.length;
//         // step-1:  calculate left max boundary-array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i = 1; i<n; i++){
//             leftMax[i] = Math.max(height[i],leftMax[i-1]);
//         } 
//         // step-2: calculate right max boundary-step

//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i = n-2; i>=0; i--){
//             rightMax[i] = Math.max(height[i],rightMax[i+1]); 
//         }

//         int trappedWater = 0;
//         // loop
//         for(int i = 0; i<n; i++){
//         // step-3: waterlevel = min(left max boundary, right max boundary)
//             int waterlevel = Math.min(leftMax[i],rightMax[i]);
//         // trapped water = waterlevel - height[i]
//             trappedWater+=waterlevel - height[i];
//         }

//         return trappedWater;



//     }


//     public static void main(String[] args) {
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedrainwater(height));

//     }
// }

// complexity is O(n)




// 



public class trappingrainwater{
    public static int trappedWater(int height[]){
        // calculate leftmax boundary or prefix max
    int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for(int i = 1; i<n; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        // calculate rightmax boundary or suffix max

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }


    int trappedWater = 0;
      for(int i = 0; i<n; i++){
        // calculate waterlevel
        int waterlevel =Math.min(leftmax[i],rightmax[i]);
        trappedWater+=waterlevel - height[i];
      }
      return trappedWater;

    }


    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(arr));
    }
}


