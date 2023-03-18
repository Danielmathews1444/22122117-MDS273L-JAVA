// Importing Scanner class for taking user input
import java.util.Scanner;
// Creating a student class to define the structure of the student
class stud{
    String Reg_No;
    String Name;
    String Email;
    String Phone;
    String Class;
    String Department;
    // Constructor to initialize student details
    public stud(String a,String b ,String c,String d,String e,String f){
        this.Reg_No = a;
        this.Name = b;
        this.Email = c;
        this.Phone = d;
        this.Class = e;
        this.Department = f;
    }

    // Method to display student details
    void display(){
        System.out.println("*************************");
        System.out.println("Register number : "+Reg_No);
        System.out.println("Name : "+Name);
        System.out.println("Email : "+Email);
        System.out.println("Phone : "+Phone);
        System.out.println("Class : "+Class);
        System.out.println("Department : "+Department);
        System.out.println("*************************");
    }

    // Method to search for a student by name or register number
    boolean search(String par,int m){
        boolean found = false;
        if(m==0){
            found = Name.equalsIgnoreCase(par);
        }
        else if(m==1){
            found = Reg_No.equals(par);
        }
        // If the student is found, their details are displayed
        if(found==true){
            display();
        }
        return found;
    }
    }

    // Creating a main class to execute the program
public class studentregister {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        stud[] studarr = new stud[100]; // creating an array to store the student objects
        int n = 0; // n is the number of students currently registered
        int k = 0; // k is used to check whether to continue or exit the program
        do{
            System.out.println("Enter 1 to add a student");
            System.out.println("Enter 2 search a student");
            System.out.println("Enter 3 to display all the details of all students");
            System.out.print("Choice -->");
            int choice=Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:
                    // adding a new student
                    System.out.println("Enter the reg_no of the student : ");
                    String a = scan.nextLine();
                    System.out.println("Enter the name of the student : ");
                    String b = scan.nextLine();
                    System.out.println("Enter the e-mail of the student : ");
                    String c = scan.nextLine();
                    System.out.println("Enter the phone of the student : ");
                    String d = scan.nextLine();
                    System.out.println("Enter the class of the student : ");
                    String e = scan.nextLine();
                    System.out.println("Enter the department of the student : ");
                    String f = scan.nextLine();
                    studarr[n] = new stud(a,b,c,d,e,f); // creating a new student object and storing it in the array
                    n++; // incrementing the number of students
                    break;
                case 2:
                    // searching for a student
                    System.out.print("Enter 0 for searching with name\nEnter 1 for searching with register number");
                    int m = Integer.parseInt(scan.nextLine());
                    boolean found = false; // a flag to indicate whether the student was found or not
                    if(m==0){
                        System.out.print("Enter the name of student you want to search :");
                        String name=scan.nextLine();
                        for(int i=0;i<n;i++){
                            if(studarr[i].search(name,m)){
                                found = true;
                                break;
                            }
                        }
                    }
                    else if(m==1){
                        System.out.print("Enter the regno of student you want to search:");
                        String reg=scan.nextLine();
                        for(int i=0;i<n;i++){
                            if(studarr[i].search(reg,m)){
                                found = true;
                                break;
                            }
                        }
                    }
                    if(found==false){
                        System.out.println("Student not found");
                    }
                    break;
                case 3:
                    // displaying details of all students
                    for(int i=0;i<n;i++){
                        studarr[i].display();
                    }
                    break;
            }
            System.out.println("Enter 0 to continue\nEnter any other key to exit");
            k=Integer.parseInt(scan.nextLine());
        }while(k==0); // loop until the user decides to exit the program
    }
}
