public class GPA {
    private int GPA;
    private int hours;
    private int quantityPoint;
    private String name;
    private float finalGPA;

    public GPA(String name, int hours, int GPA, int quantityPoint){
        this.name = name;
        this.hours = hours;
        this.GPA = GPA;
        this.quantityPoint = quantityPoint;
    }

    public int getGPA() {
        return GPA;
    }
    public int getHours(){
        return hours;
    }

    public int getQuantityPoint() {
        return quantityPoint;
    }

    public String getName() {
        return name;
    }

    public float getFinalGPA() {
        return finalGPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityPoint(int quantityPoint) {
        this.quantityPoint = quantityPoint;
    }
}
