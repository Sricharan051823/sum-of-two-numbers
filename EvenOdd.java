import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.err.println("even");
        }
        else{
            System.out.println("odd");
        }
scanner.close();
    }
}