import java.util.Scanner;
public class lab2{
    public static void main(String[] args){
        int ctrl=1;
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
                    System.out.println("Enter your name");
                    name=ob.nextLine();
                    int x=0;
                    for(int i=0;i<ctrl;i++){
                        if (name.equals(details[i])){
                            System.out.println("The name already exists");
                            x=i;
                        }
                        break;
                    }
                    if(x!=0){
                        details[x]=name;
                        ctrl++;
                        System.out.println(ctrl);
                        break;
                    } 
                    break;
                case 2:
                    System.out.println("Enter the name to search");
                    name=ob.nextLine();
                    for(int i=0;i<ctrl;i++){
                        if (name.equals(details[i])){
                            System.out.println(details[i]);
                            break;
                        }
                        else{
                            System.out.println("Entered name doesnot exists");
                            break;
                        }  
                    }
                    break;
                case 3:
                    System.out.println("Enter the name to be removed");
                    name=ob.nextLine();
                    for(int i=0;i<ctrl;i++){
                        if(name.equals(null)){
                            break;
                        }
                        if(name.equals(details[i])){
                            details[i]=details[i+1];
                        }
                    }
                    System.out.println("Entered name has been removed");
                    ctrl-=1;
                    break;
                case 4:
                    System.out.println(ctrl);
                    for(int i=0;i<ctrl;i++){
                        System.out.println(details[i]);
                    }
                    break;
            }
            System.out.println("press 1 to continue and press 0 to exit");
            choice = Integer.parseInt(ob.nextLine());
        }while(choice != 0);
        }
         }