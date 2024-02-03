import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    private float finalQP = 0;
    private int hoursCount = 0;
    ArrayList<GPA>calculate = new ArrayList<>();

    public void add_grade(){
        System.out.print("How Many Classes: ");
        int classes = sc.nextInt();
        if(classes > 0) {
            sc.nextLine();
            for (int i = 0; i < classes; i++) {
                System.out.println("Class " + (i + 1) + " Name: ");
                String name = sc.nextLine();
                System.out.println("Course Hours For " + name);
                int hours = sc.nextInt();
                hoursCount += hours;
                System.out.println("GPA For Class " + name);
                int gpa = sc.nextInt();
                sc.nextLine();
                int quantityPoint = hours * gpa;
                finalQP += quantityPoint;
                GPA finalGPA = new GPA(name, hours, gpa, quantityPoint);
                calculate.add(finalGPA);
            }
        }else{
            System.out.println("Going Back To Main Menu");
        }

    }
    public void modify_grade() {
        int quantityPoint;
        System.out.println("Which Class To Modify");
        for (int i = 0; i < calculate.size(); i++) {
            System.out.println((i + 1) + ". \tName - " + calculate.get(i).getName() + ":\tHours - " + calculate.get(i).getHours() + " \tGPA - " + calculate.get(i).getGPA() + " \tQuantityPoints - " + calculate.get(i).getQuantityPoint());
        }
        int modify = sc.nextInt() - 1;
        if (modify >= 0 && modify <= calculate.size()) {
            sc.nextLine();
            System.out.println("Which One Do You Want To Modify: ");
            System.out.println("1: Name - " + calculate.get(modify).getName());
            System.out.println("2: Hours - " + calculate.get(modify).getHours());
            System.out.println("3: GPA - " + calculate.get(modify).getGPA());
            int choice = sc.nextInt() - 1;
            GPA modCalc = calculate.get(modify);
            switch (choice) {
                case 0:
                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();
                    calculate.get(modify).setName(name);
                    modCalc.setName(name);
                    break;
                case 1:
                    System.out.print("Enter New Hours: ");
                    int hour = sc.nextInt();
                    quantityPoint = hour * calculate.get(modify).getGPA();
                    calculate.get(modify).setHours(hour);
                    calculate.get(modify).setQuantityPoint(quantityPoint);
                    modCalc.setHours(hour);
                    hoursCount -= calculate.get(modify).getHours();
                    hoursCount += hour;
                    break;
                case 2:
                    System.out.print("Enter New GPA: ");
                    int gpa = sc.nextInt();
                    quantityPoint = gpa * calculate.get(modify).getHours();
                    calculate.get(modify).setGPA(gpa);
                    calculate.get(modify).setQuantityPoint(quantityPoint);
                    modCalc.setGPA(gpa);
                    finalQP -= calculate.get(modify).getQuantityPoint();
                    finalQP += quantityPoint;
                    break;
                default:
                    System.out.println("Unknown Input");
            }
        } else{
            System.out.println("Going Back To Main Menu");
        }
    }
    public void remove_class(){
        System.out.println("Which One To Remove: ");
        for(int i = 0; i < calculate.size(); i++){
            System.out.println((i + 1) + ". " + calculate.get(i).getName());
        }
        int remove = sc.nextInt() - 1;
        if(remove >= 0 && !calculate.isEmpty() && remove <= calculate.size()){
            calculate.remove(remove);
        }else if(calculate.isEmpty()){
            System.out.println("No Classes Founded");
        }else{
            System.out.println("Going Back To Main Menu");
        }
    }
    public void display(){
        int count = 0;
        for(GPA i : calculate){
            count++;
            System.out.println(count + ". \t" + i.getName() + ":\tHours - " + i.getHours() + "\tGPA - " + i.getGPA() + "\tQuantityPoint - " + i.getQuantityPoint());
        }
        float calcGPA = finalQP / hoursCount;
        System.out.println("Your current GPA is " + calcGPA);
    }
}
