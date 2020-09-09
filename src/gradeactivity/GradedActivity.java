package gradeactivity;

public class GradedActivity {
    private double score;

    public GradedActivity(double score) {

        if (score>=0 && score<=100) {
            this.score = score;
        } else {
            System.out.println("Give a valid score between 0 and 100");
        }
    }
    public GradedActivity() {

    }

    public double getScore() {

        return score;
    }


    public void setScore(double score) {

        this.score = score;
    }

    public char getGrade(){
        char letterGrade;

        if (score >= 90)
            letterGrade = 'A';
         else if (score >= 80)
            letterGrade = 'B';
       else if (score >= 70)
            letterGrade = 'C';
         else if (score >= 60)
            letterGrade = 'D';
         else
         letterGrade = 'F';
         return letterGrade;
    }

}
