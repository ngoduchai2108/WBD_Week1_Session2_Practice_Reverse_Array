import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.println("Enter size of Array:");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("size should not exceed 20");
            }
        }while (size > 20);
        // Enter element for array
        int [] array = new int[size];
        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Enter Element "+ (i+1)+" is: ");
            array[i] = scanner.nextInt();
        }
        // Display array
        System.out.print("Array is: ");
        for (int element : array){
            System.out.print(element + "\t");
        }
        System.out.println(" ");
        //Reverse array
        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length -1-i];
            array[array.length -1-i] = temp;
        }
        //Display reverse array
        System.out.print("Reverse Array is: ");
        for (int element : array){
            System.out.print(element + "\t");
        }

    }
}
