public class Student {
    String name;
    Educator educator;
    Game game;

    public Student() {
        name = "BLANK";
        educator = new Educator();
        game = new Game();
    }

    public Student(String n) {
        name = n;
        educator = new Educator();
        game = new Game();
    }

    public Student(String n, Educator e) {
        name = n;
        educator = e;
        game = new Game();
    }
}
