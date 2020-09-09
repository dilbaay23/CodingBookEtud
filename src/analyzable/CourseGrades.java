package analyzable;

public class CourseGrades implements Analyzable {

    private GradedActivity[] grades ;

    public CourseGrades() {
        grades = new GradedActivity[4];
    }



    public void setLab(GradedActivity gradedActivity) {
        grades[0]=gradedActivity;
    }


    public void setPassFailExam(PassFailExam passFailExam) {
        grades[1]=passFailExam;
    }



    public void setEssay(Essay essay) {
        grades[2]=essay;
    }


    public void setFinalExam(FinalExam finalExam) {
        grades[3]=finalExam;
    }

    @Override
    public String toString() {
        return "Lab Score: " + grades[0].getScore() + "  Lab Grade: " +  grades[0].getGrade()
                +"\nPass/Fail Score: " + grades[1].getScore() + "  Pass/Fail Grade: " +  grades[1].getGrade()
                +"\nEssay Score: " + grades[2].getScore() + "  Essay Grade: " +  grades[2].getGrade()
                +"\nFinal Exam Score: " + grades[3].getScore() + "  Final Exam Grade: " +  grades[3].getGrade();
    }

    @Override
    public double getAverage() {
        double totalScore=0;
        int numberOfElement=grades.length;
        for (GradedActivity gradedActivity:
             grades) {
            totalScore += gradedActivity.getScore();
        }
        return totalScore/numberOfElement;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity maxScore=grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getScore()>=maxScore.getScore())
                maxScore = grades[i];
        }
        return maxScore;
    }


    @Override
    public GradedActivity getLowest() {
        GradedActivity minScore=grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getScore()<=minScore.getScore())
                minScore = grades[i];
        }
        return minScore;
    }
}
