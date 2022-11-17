
import java.util.InputMismatchException;
import java.util.Scanner;



/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных. */

/**
 * ex1
 */
public class ex1 {

    public static void main(String[] args) {
        usersFloat();
    }

    public static void usersFloat() {
        float value =0;
        while (value == 0) {
            
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input float number");
                value = sc.nextFloat();
                System.out.println();
                System.out.println("Value = "+ value);
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("not float. input correct number");
            } catch (NullPointerException e){
                System.out.println("Input float number");
            }
        }
        
    }
}
        
        
        

        
    
