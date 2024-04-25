import java.util.ArrayList;

public class Game {
    String learningPath;
    String languages[];
    ArrayList<CodingChallenge> codingChallenges; //list of challenges held within game (unique for each student)
    ArrayList<CodingChallenge> assignedChallenges;//challenges assigned by teacher to student
    ArrayList<CodingChallenge> inProgressChallenges; //in progress challenges
    ArrayList<CodingChallenge> completedChallenges; //completed


    public Game() {
        learningPath = "NONE";
        languages = new String[]{"C", "C++", "C#", "Java", " Python"};
        codingChallenges = new ArrayList<>();
        assignedChallenges = new ArrayList<>();
        inProgressChallenges = new ArrayList<>();
        completedChallenges = new ArrayList<>();
    }

    public Game(String lp) {
        learningPath = lp;
        languages = new String[]{"C", "C++", "C#", "Java", " Python"};
        codingChallenges = new ArrayList<>();
        assignedChallenges = new ArrayList<>();
        inProgressChallenges = new ArrayList<>();
        completedChallenges = new ArrayList<>();
    }

}