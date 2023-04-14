import java.io.*;
import java.util.Scanner;
public class textreader {
    static String[][] charCounter(String a,char[] b){
        char[] arr = b;
        int[] count = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int counter = 0;
            for(int j=0;j<a.length();j++){
                if(arr[i]==a.charAt(j)){
                    counter++;
                }
            count[i]=counter;
            }
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            for (int j1 = i1 + 1; j1 < arr.length; j1++) {
                if (count[j1] > count[i1]) {
                    int temp1 = count[i1];
                    count[i1] = count[j1];
                    count[j1] = temp1;
    
                    char temp2=arr[i1];
                    arr[i1] = arr[j1];
                    arr[j1] = temp2;
                }
            }
        }
        String[][] wrdcnt = new String[2][arr.length];
        for (int i = 0; i < arr.length; i++) {
            wrdcnt[0][i] = arr[i]+"";
            wrdcnt[1][i] = Integer.toString(count[i]); 
        }
        return wrdcnt;     
    }
    static String[][] wordcount(String a){
        int w = 0;
        a = a.replace(".","");
        a = a.replace(",","");
        String[] arr1 = a.split(" ");
        String[] arr = new String[arr1.length];
        int[] count = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            int counter = 1;
            boolean uniq = true;
            if(w>0){
                for(int j=0;j<w;j++){
                    if(arr1[i].equalsIgnoreCase(arr[j])){
                        uniq = false;
                        break;
                    }
                }
            }
            if(uniq){
                for(int k=0;k<arr1.length;k++){
                    if(arr1[i].equalsIgnoreCase(arr1[k])&& i!=k){
                        counter++;
                    }
                }
                arr[w]=arr1[i];
                count[w]=counter;
                w++;
            }
        }
        for (int i1 = 0; i1 < w; i1++) {
            for (int j1 = i1 + 1; j1 < w; j1++) {
                if (count[j1] > count[i1]) {
                    int temp1 = count[i1];
                    count[i1] = count[j1];
                    count[j1] = temp1;
    
                    String temp2=arr[i1];
                    arr[i1] = arr[j1];
                    arr[j1] = temp2;
                }
            }
        }
        String[][] wrdcnt = new String[2][w];
        for (int i = 0; i < w; i++) {
            wrdcnt[0][i] = arr[i];
            wrdcnt[1][i] = Integer.toString(count[i]);
        }
        return wrdcnt;
    }
    static String[][] vowel(String a){
        char[] vowels={'a','e','i','o','u'};  
        String b=a.toLowerCase();
        return(charCounter(b,vowels));
    }
    static String[][] digit(String a){
        char[] digits={'0','1','2','3','4','5','6','7','8','9'};
        return(charCounter(a,digits));
    }
    static String[][] topwrd(String a){
        String[][]arr1= wordcount(a);
        String[][]arr=new String[2][5];
        for(int i=0;i<5;i++){
            arr[0][i]=arr1[0][i];
            arr[1][i]=arr1[1][i];
        }
        return arr;
    }
    static String[][] leastwrd(String a){
        String[][]arr1= wordcount(a);
        String[][]arr=new String[2][5];
        for(int i=arr1[1].length-1;i>=arr1[0].length;i--){
            arr[0][i]=arr1[0][i];
            arr[1][i]=arr1[1][i];
        }
        return arr;
    }
    static String[][] topchar(String a){
        char[] arr1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[][] arr = charCounter(a,arr1);
        for(int i=0;i<5;i++){
            
        }
    }
    public static void main(String[] args) {
        String str = "";
        try{
            File fr =new File("text.txt");
            Scanner scan =new Scanner(fr);
            while(scan.hasNextLine()){
                String s = scan.nextLine();
                str+=s;
            }
            scan.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        // String[] arr=vowel(str);
        // System.out.print("[");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+", ");
        // }
        // System.out.print("]");
            topwrd(str);
    }
}
