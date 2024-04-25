public class Student {
    //student class 
    String name;
    String  educator;
    Game game;

    public Student() {
        name = "";
        educator = "";
        game = new Game();
    }

    public Student(String n, String e) {
        //creates the student name and assigned educator with it. Game filled with challenges assigned
        name = n;
        educator = e;
        game = new Game();
    }

        public boolean hasChallengesAssigned() {
        return !game.assignedChallenges.isEmpty();
    }
}

