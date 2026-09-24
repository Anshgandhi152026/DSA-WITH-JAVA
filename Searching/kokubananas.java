public class kokubananas {

    public static int minEatingspeed(int piles[],int h){
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int i = 0; i<piles.length; i++){
            maxSpeed = Math.max(maxSpeed,piles[i]);
        }

        // apply binary search
        while(minSpeed<maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;
            if(canEatTime(piles, h, mid)){  // per hrs i can eat mid no of bananas
                maxSpeed = mid;
                // maxSpeed = mid - 1;
            }
            else{
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    public static boolean canEatTime(int piles[],int h,int mid){
        int total_hrs = 0;
        for(int i = 0; i<piles.length; i++){
            total_hrs+= (piles[i] + mid -1)/mid;
        }
        if(total_hrs>h){
            return false;
        }
        return total_hrs<=h;
    }
    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int h = 8;

        System.out.println(minEatingspeed(piles, h));
    }
}
