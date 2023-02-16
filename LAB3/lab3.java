
// Importing the Scanner class from the Java Util Library
import java.util.Scanner;
public class Lab3 {
// Function to calculate mean of an array of integers
static float calculateMean(int[] arr){
    float sum = 0;
    for(int i=0; i<arr.length; i++){
        sum += arr[i];
    }
    float mean = sum/arr.length;
    return mean;
}

// Function to calculate median of an array of integers
static float calculateMedian(int[] arr){
    float median = 0;

    // Sorting the array in ascending order
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            if(arr[j] >= arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    // Calculating the median of the array
    for(int i=0; i<arr.length; i++){
        if(arr.length % 2 == 0){
            float m = (arr[(arr.length/2)-1] + arr[(arr.length/2)]);
            median = m/2;
        } else {
            median = arr[(arr.length-1)/2];
        }
    }

    return median; 
}

// Function to calculate mode of an array of integers
static int calculateMode(int[] arr){
    int max = 0;
    int mode = 0;

    for(int i=0; i<arr.length; i++){
        int count = 0;
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count > max){
            max = count;
            mode = arr[i];
        }
    }

    // If no mode is present in the array
    if(max == 1){
        mode = 0;
    }

    return mode;
}

// Main function
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int ctrl = 0;
    int[] arr = new int[10];

    // Taking input from the user and storing it in the array
    for(int i=0; i<arr.length; i++){
        System.out.print("Enter the " + (i+1) + "th element of the array: ");
        arr[i] = Integer.parseInt(scan.nextLine());
    }
    //menu
    do {
        System.out.println("*****MENU******");
        System.out.println("1) Mean\n2) Median\n3) Mode");

        int choice = Integer.parseInt(scan.nextLine());

        switch(choice) {
            case 1://mean
                System.out.println("The mean of the array is: " + calculateMean(arr));
                break;
            case 2://median
                System.out.println("The median of the array is: " + calculateMedian(arr));
                break;
            case 3://mode
                int m = calculateMode(arr);//check if there is a mode or not
                if(m == 0){
                    System.out.println("The given array has no mode");
                } else {
                    System.out.println("The mode of the array is: " + m);
                }
                break;
        }

        System.out.print("Press 0 to continue.\nPress any other key to exit.\nChoice --> ");
        ctrl = Integer.parseInt(scan.nextLine());

    } while(ctrl == 0);
}
}
