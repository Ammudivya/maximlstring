import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String c="";
       for(int i=0;i<s.length();i++){
           Boolean found=false;
           for(int j=0;j<c.length();j++){
               if(s.charAt(i)==c.charAt(j)){
                   found=true;
                   break;
               }
           }
           if(found==false){
               c=c.concat(String.valueOf(s.charAt(i)));
           }
       }
       System.out.println(c.length());
           
       }
       
    }
