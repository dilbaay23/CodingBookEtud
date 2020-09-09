package gradeactivity;

public class FinalExam extends GradedActivity{

    final int FINAL_EXAM_QUESTIONS = 50;

    public FinalExam( int correctAnswer) {

            setScore(correctAnswer*2);

    }
}
