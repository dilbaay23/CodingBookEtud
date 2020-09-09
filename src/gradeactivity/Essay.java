package gradeactivity;

import gradeactivity.GradedActivity;

public class Essay extends GradedActivity {
    final int GRAMMAR = 30;
    final int SPELLING = 20;
    final int LENGTH = 20;
    final int CONTENT = 30;

    private int grammarScore;
    private int spellingScore;
    private int lengthScore;
    private int contentScore;

    public Essay(int essayScore) {
        setScore(essayScore);
    }

    public Essay(int grammarScore, int spellingScore, int lengthScore, int contentScore) {
        this.grammarScore = validScore(GRAMMAR,grammarScore);
        this.spellingScore = validScore(SPELLING,spellingScore);
        this.lengthScore = validScore(LENGTH, lengthScore);
        this.contentScore = validScore(CONTENT,contentScore);
        setScore(this.grammarScore+this.spellingScore+this.lengthScore+this.contentScore);


//        setContentScore(contentScore);
//        setGrammarScore(grammarScore);
//        setLengthScore(lengthScore);
//        setSpellingScore(spellingScore);

    }



    public int getGrammarScore() {
        return grammarScore;
    }

    public void setGrammarScore(int grammarScore) {
        this.grammarScore = validScore(GRAMMAR,grammarScore);
        setScore(this.grammarScore+this.spellingScore+this.lengthScore+this.contentScore);
    }

    public int getSpellingScore() {
        return spellingScore;
    }

    public void setSpellingScore(int spellingScore) {
        this.spellingScore = validScore(SPELLING,spellingScore);
        setScore(this.grammarScore+this.spellingScore+this.lengthScore+this.contentScore);
    }

    public int getLengthScore() {
        return lengthScore;
    }

    public void setLengthScore(int lengthScore) {
        this.lengthScore = validScore(LENGTH, lengthScore);
        setScore(this.grammarScore+this.spellingScore+this.lengthScore+this.contentScore);
    }

    public int getContentScore() {
        return contentScore;
    }

    public void setContentScore(int contentScore) {
        this.contentScore = validScore(CONTENT,contentScore);
        setScore(this.grammarScore+this.spellingScore+this.lengthScore+this.contentScore);
    }

    public int validScore(int check,int puan){
        if(puan < 0 || puan > check){
            System.out.println("points should be between 0 and " + check);
            return 0;
        }
        else return puan;
    }
}
