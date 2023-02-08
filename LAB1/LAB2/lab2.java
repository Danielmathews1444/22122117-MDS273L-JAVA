import java.util.Scanner;
public class lab2{
    public static void main(String[] args){
        int ctrl_var=1024;
        int choice;
        String name;
        String[] details = new String[ctrl_var];
        Scanner ob =new Scanner(System.in);
        do{
            System.out.prinln("WELCOME \n please enter:");
         System.out.prinln("1--> Enter a name");
         System.out.prinln("2--> Search for a name");
         System.out.prinln("3--> Remove all name");
         System.out.prinln("4--> Show all name");
         System.out.prinln("Make your choice");
         choice = Integer.parseInt(ob.nextLine());
         switch(choice){
            case 1:
                ctrl_var+=1;
                System.out.prinln("Enter your name");
                name=ob.nextLine();
                if (details.contains(name)){
                    System.out.prinln("The name already exists");
                }
                else{
                    details[-1]=name;
                } 
                break;
        System.out.prinln("end");
   
            // case 2:
            //     System.out.prinln("Enter a name to search");
            //     name=ob.nextLine();
            //     for(int i=0;i<details.length;i++){
            //         if (details.contains(name))
            //     }



                


         }
         }
    }
}