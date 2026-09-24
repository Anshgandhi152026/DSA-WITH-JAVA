
import java.util.Scanner;

// import java.util.*;
// public class linearsearch{
//     public static int linearsearch(int numbers[],int key){
//         for(int i = 0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }





    // public static int menuitems(String items[],String keyItem){
    //     for(int i = 0; i<items.length; i++){
    //         if(items[i].equals(keyItem)){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }



    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String items[] = {"Rissole","Funnel cake","Gulab jamun","Paneer","Curd"};


    //     System.out.print("Enter the keyItem to search: ");
    //     String keyItem = sc.nextLine();
    //     int index = menuitems(items, keyItem);
    //     if(index == -1){
    //         System.out.print(keyItem+ " not found");
    //     }
    //     else{
    //         System.out.print(keyItem+ " found at index:  "+index);
    //     }
    // }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int numbers[] = {1,3,8,7,9,63,41};

//         System.out.print("Enter the element to search: ");
//         int key = sc.nextInt();
//         int index = linearsearch(numbers, key);

//         if(index == -1){
//             System.out.print(key+" not found");
//         }
//         else{
//             System.out.print(key+" found at index: "+index);
//         }

//     }
// }


public class linearsearch{
    public static int linear(int arr[],int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int ans = linear(arr, key);
        if(ans == -1){
            System.out.print(key+ " not found");
        }
        else{
            System.out.print(key+ " found at "+ ans +" ");
        }
    }
}