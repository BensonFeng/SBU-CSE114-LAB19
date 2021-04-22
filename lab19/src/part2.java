import java.util.Scanner;

public class part2 {
	public static void main(String[] args) {
		int i = 0;
		int[] array = new int[100];//create array w/ size 100
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);//iterate the 1d array and assign random number between 1-100
            }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index: ");//ask user
        
        try {
        	int index = input.nextInt();//user input int

            System.out.println("array[" + index + "]=" + array[index]);

        } catch (IndexOutOfBoundsException exeption) {

            System.out.println("The index " + exeption.getLocalizedMessage() + " is out of bounds");//print when user num greate or equal to 100

        } catch (Exception exeption) {

            System.out.println("invalid input for the index");//print other 

        }

    }

}