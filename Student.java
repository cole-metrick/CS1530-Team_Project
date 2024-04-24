public class Student {
    String name;
    Educator educator;

    public Student() {
        name = "BLANK";
        educator = new Educator();
    }

    public Student(String n) {
        name = n;
        educator = new Educator();
    }

    public Student(String n, Educator e) {
        name = n;
        educator = e;
    }
}
