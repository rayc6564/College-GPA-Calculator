import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>grades = new ArrayList<Integer>();

        Calculator calculate = new Calculator();
        int choice;

        System.out.println();
        System.out.println("College GPA Calculator");

        do{
            System.out.println();
            System.out.println("Enter A Negative Number To Main Menu");
            System.out.println("1. Add Classes");
            System.out.println("2. Modify Classes");
            System.out.println("3. Remove Classes");
            System.out.println("4. Display Classes");
            System.out.println("5. Finished");
            choice = sc.nextInt();
            System.out.println();
            switch (choice){
                case 1:
                    calculate.add_grade();
                    break;
                case 2:
                    calculate.modify_grade();
                    break;
                case 3:
                    calculate.remove_class();
                    break;
                case 4:
                    calculate.display();
                    break;
                default:
                    System.out.println("Not One Of The Options");
                    break;
                    
            }

        }while(choice != 5);
        System.out.println();
        System.out.println("Done");
        System.out.println();

    }
}