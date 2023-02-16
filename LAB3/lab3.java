import java.util.Scanner;
public class lab3{
    /////////////////////////////////////
    static float mean(int[] arr){
        float z=0;
        for(int i=0;i<arr.length;i++){
            z+=arr[i];
        }
        float x =  z/arr.length;
        return  x;
    }
    ////////////////////////////////////////////
    static float median(int[] arr){
        float median = 0;
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        }
        for(int i=0;i<arr.length;i++){
            if(arr.length % 2==0){
                float m=(arr[(arr.length/2)-1]+arr[(arr.length/2)]);
                median = m/2;
            }else{
                median = arr[(arr.length-1)/2];
            }
        }
        return median; 
    }
    /////////////////////////////////////////////
    static int mode(int[] arr){

        int max = 0;
        int mode = 0;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                mode=arr[i];
            }
            }
        if(max==1){
            mode=0;
        }
        return mode;
    }
    //////////////////////////////////////////////
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ctrl = 0;
        int[] arr = new int[10];
        for(int i=1;i<arr.length+1;i++){
            System.out.print("Enter the "+i+"th element of the array : ");
            arr[i]=Integer.parseInt(scan.nextLine());
        }
        do{
            System.out.println("*****MENU******");
            System.out.println("1) Mean\n2) Median\n3) Mode");
            int choice = Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:
                    System.out.println("The mean of the array is : "+mean(arr));
                    break;
                case 2:
                    System.out.println("The median of the array is : "+median(arr));
                    break;
                case 3:
                    int m=mode(arr);
                    if(m==0){
                        System.out.println("The given array has no mode");
                    }else{
                        System.out.println("The mode of the array is : "+m);
                    }
                    break;
            }
            System.out.print("press 0 to continue \n press any other to exit\nChoice --> ");
            ctrl=Integer.parseInt(scan.nextLine());
        }while(ctrl==0);
            }
}