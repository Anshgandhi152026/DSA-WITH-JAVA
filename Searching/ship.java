public class ship {
    // now find dayneeded ka liye ham function create karege
    public static boolean feasableDays(int[] weights,int capacity,int days){
        int currentLoad = 0;
        int daysNeeded = 1;
        for(int i = 0; i<weights.length; i++){
            currentLoad+=weights[i];
            if(currentLoad>capacity){
                daysNeeded++;
                currentLoad = weights[i];
            }
        }
        return daysNeeded<=days;
    }
    public static int ShipwithinDays(int[] weights,int days){
        int n = weights.length;
        // pahle to ham totalload aur maxload find karege ki ship me kitna aa sakta ha 
        // totalload to sabhi weights ka sum hoga 
        // or maxload sabhi weights me se max value
        // let's find it
        int totalload = 0;
        int maxload = 0;
        for(int i = 0; i<n; i++){
            totalload+=weights[i];
            maxload = Math.max(maxload,weights[i]);
        }
        // hamari capacity hogi maxload se lekar totalload ka bich tak ki hogi 
        // apply binary search
        int left = maxload;
        int right = totalload;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(feasableDays(weights, mid, days)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = ShipwithinDays(weights,days);
        System.out.println("The min capacity to load the packages with "+days+" is :  "+ans);
    }
}


// add new button



// add new form 

