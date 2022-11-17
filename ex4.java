/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        UsersString();
      
    }
    public static void UsersString()  {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your sting");
        String st  = sc.nextLine();
        if(!st.isEmpty()){
            System.out.println();
            System.out.println("Your string: "+ st);
            sc.close(); 
        }else{
            sc.close();
            throw new RuntimeException("Empty string prohibited");
        }

        
    }
}
