public class sqrt {
    public static int squareRootofx(int x){
        if(x == 0){
            return 0;
        }
        int low = 1;
        int high = x;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(mid == x/mid){
                return mid;
            }
            else if(mid > x/mid){
                high = mid - 1;
            }
            else{
                // mid < x/mid
                // we get potentional answer
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 4;
        int res = squareRootofx(x);
        System.out.println("The square root of "+ x +" is:  "+res);
    }
}
