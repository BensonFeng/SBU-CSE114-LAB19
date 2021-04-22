import java.util
.InputMismatchException;
import java.util.Scanner;
public class part1 {
	public static void main(String[] args) {
        int int1=0;
        int int2=0;
		Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        boolean isValid = false;
        while (!isValid) {
            try {
                int1 = input.nextInt();
                int2 = input.nextInt();
                isValid = true;
                
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.println("Please enter two integers" );
            }
        }
        System.out.println(int1 + "+" + int2 + "=" + (int1 + int2));
    }
}