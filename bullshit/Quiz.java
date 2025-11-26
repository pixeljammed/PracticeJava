package bites.examples;

public class Quiz {
    String question1;
    String question2;

    public String getQuestion1() {
        return question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public Quiz(String question1, String question2) {
        this.question1 = question1;
        this.question2 = question2;
    }

    public static void main(String[] args) {
        Quiz swagQuiz = new Quiz("What is the name of the 2004 hit game developed and published by Valve?", "I don't really care. I hate you.");
        System.out.println(swagQuiz.getQuestion1());
        System.out.println(swagQuiz.getQuestion2());
    }
}
