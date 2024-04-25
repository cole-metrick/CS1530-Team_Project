public class Student {
    String name;
    Educator educator;
    Game game;

    public Student() {
        name = "";
        educator = new Educator();
        game = new Game();
    }

    public Student(String n, String e) {
        name = n;
        educator = e;
        game = new Game();
    }
}
