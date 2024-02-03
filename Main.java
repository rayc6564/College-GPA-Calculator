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
            System.out.println("5. Use Recent GPA and This Semester GPA to Find Out Current GPA");
            System.out.println("6. Finished");
            choice = sc.nextInt();
            System.out.println();
            switch (choice){
                case 1:
                    calculate.addClass();
                    break;
                case 2:
                    calculate.modifyClass();
                    break;
                case 3:
                    calculate.removeClass();
                    break;
                case 4:
                    calculate.display();
                    break;
                case 5:
                    calculate.twoGPA();
                    break;
                default:
                    System.out.println("Not One Of The Options");
                    break;
                    
            }

        }while(choice != 6);
        System.out.println();
        System.out.println("Done");
        System.out.println();

    }
}