package gradeactivity;

public class PassFailExam extends GradedActivity{

    final int PASS_FAIL_EXAM_QUESTIONS = 10;

    public PassFailExam(int correctAnswer) {

        if (correctAnswer>=7 && correctAnswer<=10) {
            setScore(correctAnswer*10);
        } else {
            setScore(50);
        }

    }
}
