//     public static void update(int marks[]){
//         for(int i = 0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]){
//         // int marks[] = new int[50];  // 50 size ka marks name vala array create ho gya ha memory me and this is empty array by array elements are take value 0
//         // int numbers[] = {1,2,3}; // another way of creating array java automatically take size of array in memory

//         // String fruits[] = {"Mango","papaya","Banana"}; // this is string array



//         // input output in array


// // int marks[] = new int[50];
// // Scanner sc = new Scanner (System.in);
// // System.out.print("Enter the physics marks: ");
// // marks[0] = sc.nextInt();// phy
// // System.out.print("Enter the chemistry marks: ");
// // marks[1] = sc.nextInt();// chem
// // System.out.print("Enter the math marks: ");
// // marks[2] = sc.nextInt();// math

// // System.out.println("phy marks is: "+marks[0]);
// // System.out.println("chem marks is: "+marks[1]);
// // System.out.println("math marks is: "+marks[2]);

// // System.out.print("length of marks array is: "+marks.length);



// // passing arrays as a argument
// int marks[] = {94,97,99};

// update(marks);

// // print marks
// for(int i = 0; i<marks.length; i++){
//     System.out.print(marks[i]+" ");
// }

// System.out.println();




//     }
// }


//  input output in array
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter array size: ");
//     int n = sc.nextInt();
//     // declare array
//         // int arr[] = new int[n];
//         int [] arr = new int[n];
//         // input elements
//         System.out.print("Enter "+ n +" elements: "); 
//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // output elements
//         System.out.print("Array elements are: ");
//         for(int i = 0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();

    
//     }
// }


import java.util.*;

public class arrintro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Output marks
        System.out.println("\nMarks entered are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    }
}
// import java.util.*;
// public class arrintro{
//     public static void main(String[] args) {
//         int marks[] = new int[100];
//         Scanner sc = new Scanner (System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("Physics marks is: "+marks[0]);
//         System.out.println("Chemistry marks is: "+marks[1]);
//         System.out.println("Maths marks is: "+marks[2]);


//     }
// }
// public class arrintro{
//     public static void update(int marks[]){
//         for(int i = 0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String[] args) {
//         int marks[] = {97,98,99};
//         update(marks);
//         // print the marks
//         for(int i = 0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }