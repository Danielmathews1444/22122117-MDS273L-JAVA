import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;
public class Student{
    public static void main(String[] args){
        Scanner ob= new Scanner(System.in);
        String Name;
        int Age;
        char Gender;
        int Reg_num;
        String State;
        String word;
        System.out.print("Enter your name : ");
        Name = ob.nextLine();
        System.out.print("Enter your age : ");
        Age = Integer.parseInt(ob.nextLine());
        System.out.print("Enter your gender : ");
        Gender = ob.nextLine().charAt(0);
        System.out.print("Enter your Register number : ");
        Reg_num = Integer.parseInt(ob.nextLine());
        System.out.print("Enter the name of your State : ");
        State = ob.nextLine();
        System.out.println("Name : "+ Name);
        System.out.println("Age : "+ Age);
            if(Gender=='m' | Gender=='M'){
                System.out.println("Gender : Male ");
            }
            else if(Gender=='f' | Gender=='F'){
            System.out.println("Gender : Female ");     
    }
        switch(State){
            case"Gujarat":
                word="The student is from West india";
            case"Goa":
                word="The student is from West india";
            case"Maha Rashtra":
                word="The student is from West india";
            case"Arunachal Pradesh":
                word="The student is from East india";
            case "Assam":
                word="The student is from East india";
            case " Manipur":
                word="The student is from East india";
            case "Delhi":
                word = "The Student is from the southern states of India";
                break;

            case "Haryana":
                word = "The Student is from the southern states of India";
                break;

            case "Jammu and Kashmir":
                word = "The Student is from the southern states of India";
                break;

            case "Himachal Pradesh":
                word = "The Student is from the southern states of India";
                break;

            case "Uttarpradesh":
                word = "The Student is from the southern states of India";
                break;

            case "Punjab":
                word = "The Student is from the southern states of India";
                break;

            case "Uttarakhand":
                word = "The Student is from the southern states of India";
                break;

            case "Rajasthan":
                word = "The Student is from the southern states of India";
                break;

            case "Ladakh":
                word = "The Student is from the southern states of India";
                break;

            case "Chandigarh":
                word = "The Student is from the southern states of India";
                break;

            
            case "Andaman & Nicobar":
                word = "The Student is from the northern states of India";
                break;

            case "Andhra Pradesh":
                word = "The Student is from the northern states of India";
                break;

            case "Karnataka":
                word = "The Student is from the northern states of India";
                break;
            
            case "Lakshadweep":
                word = "The Student is from the northern states of India";
                break;

            case "Pondicherry":
                word = "The Student is from the northern states of India";
                break;

            case "Tamilnadu":
                word = "The Student is from the northern states of India";
                break;
                System.out.print(word);
        }
    

}
}