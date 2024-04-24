import java.util.ArrayList;

public class Educator {
    String name;
    ArrayList<Student> student;

    public Educator() {
        name = "BLANK";
        student = new ArrayList<>();
    }

    public Educator(String n) {
        name = n;
        student = new ArrayList<>();
    }

    public Educator(String n, ArrayList<Student> stud) {
        name = n;
        student = stud;
    }

    public void assignCodingChallenge() {
        System.out.println("Assigning Challenge...");
    }
}