import java.util.Scanner;
class stud{
    String Reg_No;
    String Name;
    String Email;
    String Phone;
    String Class;
    String Department;
    
    public stud(String a,String b ,String c,String d,String e,String f){
        this.Reg_No = a;
        this.Name = b;
        this.Email = c;
        this.Phone = d;
        this.Class = e;
        this.Department = f;
        
    }
    void display(){
        System.out.print("*************************");
        System.out.print("Register number : "+Reg_No);
        System.out.print("Name : "+Name);
        System.out.print("Email : "+Email);
        System.out.print("Phone : "+Phone);
        System.out.print("Class : "+Class);
        System.out.print("Department : "+Department);
        System.out.print("*************************");
    }
    boolean search(String par,int m){
        if(m==0){
       boolean found = Name.equalsIgnoreCase(par)
        }
        else if(m==1){
        boolean found = Regno.equals(par);
        }
       if(found){
        display();
       }
       return result;

    }

}
public class studentregister{
        public void add(n){
        System.out.print("Enter the reg_no of the student : ");
        a = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the name of the student : ");
        b = scan.nextLine();
        System.out.print("Enter the e-mail of the student : ");
        c = scan.nextLine();
        System.out.print("Enter the phone of the student : ");
        d = scan.nextLine();
        System.out.print("Enter the class of the student : ");
        e = scan.nextLine();
        System.out.print("Enter the department of the student : ");
        f = scan.nextLine();
        stud[n] = new stud(a,b,c,d,e,f);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        stud[] studarr = new stud[100];
        int n = 0;
        do{
            System.out.println("Enter 1 to add a student");
            System.out.println("Enter 2 search a student");
            System.out.println("Enter 3 to display all the details of all students");
            choice=Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:
                    add(n);
                case 2:
                    System.out.print("Enter 0 for searching with name\nEnter 1 for searching with name");
                    int m = Integer.parseInt(scan.nextLine());
                    if(m==0){
                        System.out.print("Enter the name of student you want to search :");
                        String name=scan.nextLine();
                        boolean found =false;
                        for(int i=0;i<n;i++){
                            if(studarr[i].search(name,m)){
                                found =true;
                                break;
                            }
                        }
                            if(!found){
                                System.out.println("Student not found");
                            }
                            break;
                        }
                    else if(m==1){
                        System.out.print("Enter the regno of student you want to search:");
                        String reg=scan.nextLine();
                            for(int i=0;i<n;i++){
                                if(studarr[i].search(name,m)){
                                    found =true;
                                    break;
                                }
                                if(!found){
                                    System.out.println("Student not found");
                                }
                                break;
                        }
                    }
                    




        }
        




    }
}