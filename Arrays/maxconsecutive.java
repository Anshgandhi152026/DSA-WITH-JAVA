public class maxconsecutive {
    public static int findmaxones(int arr[]) {
        int count = 0;
        int maxi = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,1,1,1,1,1,0,1};
        System.out.println(findmaxones(arr));
    }
}
