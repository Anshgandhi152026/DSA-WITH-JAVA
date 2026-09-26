public class mindays {
    public static int canMakeBoquet(int bloomDay[],int mid,int k){
        int bouquecount = 0;
        int consequtivecount = 0;
        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i]<=mid){
                consequtivecount++;
            }
            else{
                consequtivecount = 0;
            }
            if(consequtivecount == k){
                bouquecount++;
                consequtivecount = 0;
            }
        }
        return bouquecount;
    }
public static int mindaystomakembouquets(int bloomday[],int m,int k){
    // m -> number of boquets you have to make
    // k-> har bouquets ka liye kitna adjacent flowers hone chaiya 
    int startday = 0;
    int endday = 0;
    for(int i = 0; i<bloomday.length; i++){
        endday = Math.max(endday,bloomday[i]);
    }

    int minday = -1;
    while(startday<=endday){
        int mid = startday + (endday - startday)/2;
        if(canMakeBoquet(bloomday, mid, k)>=m){
            minday = mid;
            endday = mid - 1;
        }
        else{
            startday = mid + 1;
        }
        
    }
    return minday;
}
     public static void main(String[] args) {
        int bloomDay[] = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        int ans = mindaystomakembouquets(bloomDay, m, k);
        System.out.println("The minimum number of days to make " +m+ " bouque with " +k+ " adjacent pair is :  "+ans);
    }
}

