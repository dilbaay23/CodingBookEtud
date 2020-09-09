package analyzable;

public class PassFailExam extends GradedActivity {

    final int PASS_FAIL_EXAM_QUESTIONS = 10;
    final int PASS_LIMIT = 7;

    @Override
    public char getGrade() {
        return 'F';
    }

    public PassFailExam(int correctAnswer) {

        if (correctAnswer>=PASS_LIMIT && correctAnswer<=PASS_FAIL_EXAM_QUESTIONS) {
            setScore(correctAnswer*10);
        } else if (correctAnswer>=0 && correctAnswer<=PASS_LIMIT){
            setScore(correctAnswer*10);
            getGrade();
        }
        else System.out.println("Invalid Correct answer.There are only 10 Questions :)");

    }
}