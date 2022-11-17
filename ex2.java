public class ex2 {
    public static void main(String[] args) {
    int[] Array = {1,2,3,123};
        try {
            int d = 0;
            double catchedRes1 = Array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("index out of bound: " + e);
        }
         
    }
}
