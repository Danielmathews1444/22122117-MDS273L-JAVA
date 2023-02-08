import java.util.Scanner;
public class lab2{
    public static void main(String[] args){
        int ctrl=0;
        int choice;
        String name;
        String[] details = new String[1024];
        Scanner ob =new Scanner(System.in);
        do{
            System.out.println("WELCOME \n please enter:");
            System.out.println("1--> Enter a name");
            System.out.println("2--> Search for a name");
            System.out.println("3--> Remove a name");
            System.out.println("4--> Show all name");
            System.out.println("Make your choice");
            choice = Integer.parseInt(ob.nextLine());
            switch(choice){
                case 1:
                    System.out.print("Enter your name : ");
                    name=ob.nextLine();
                    int x=0;
                    for(int i=0;i<ctrl;i++){
                        if (name.equals(details[i])){
                            System.out.println("The name already exists");
                            x=i;
                            break;
                        }
                    }
                    if(x==0){
                        details[ctrl]=name;
                        ctrl++;
                    } 
                    break;
                case 2:
                    System.out.print("Enter the name to search : ");
                    name=ob.nextLine();
                    int z=0;
                    for(int i=0;i<ctrl;i++){
                        if (name.equals(details[i])){
                            System.out.println("The name is : " + details[i]);
                            z=1;
                        }
                        break;
                    }
                        
                    if(z==0){
                        System.out.println("Entered name doesnot exists");
                    }  
                    break;
                case 3:
                    System.out.print("Enter the name to be removed : ");
                    name=ob.nextLine();
                    int k=0;
                    for(int i=0;i<ctrl;i++){
                        if(name.equals(null)){
                            break;
                        }
                        if(name.equals(details[i])){
                            k=1;
                        }
                        if(k==1){
                            details[i]=details[i+1];

                        }
                        else{
                     System.out.println("Entered name does not exists");                           
                        }
                    }
                    System.out.println("Entered name has been removed");
                    ctrl-=1;
                    break;
                case 4:
                    for(int i=0;i<ctrl;i++){
                        System.out.println(details[i]);
                    }
                    break;
                default:
                    System.out.println("Invalid option please try again");

            }
            System.out.println("press 1 to continue and press 0 to exit");
            choice = Integer.parseInt(ob.nextLine());
        }while(choice != 0);
        }
         }