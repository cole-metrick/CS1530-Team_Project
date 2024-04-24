public class CodingChallenge {
    String language;
    int progress;
    String[] hints;
    String[] explanation;

    public CodingChallenge(String l) {
        language = l;
        progress = 0;
        hints = new String[]{"Hint1", "Hint2", "Hint3"};
        explanation = new String[]{"Exp1", "Exp2", "Exp3"};
    }
}