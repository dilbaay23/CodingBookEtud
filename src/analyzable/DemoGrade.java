package analyzable;

public class DemoGrade {
    public static void main(String[] args) {
    //    Scanner scanner=new Scanner(System.in);

        
//        Essay essay= new Essay(40,19,19,30);
//        System.out.println(essay.getGrade());


       CourseGrades courseGrades = new CourseGrades();

       GradedActivity gradedActivity = new GradedActivity(47);
        courseGrades.setLab(gradedActivity);

        Essay essay = new Essay(99);
        courseGrades.setEssay(essay);

        FinalExam finalExam = new FinalExam(41);
        courseGrades.setFinalExam(finalExam);

        PassFailExam passFailExam = new PassFailExam(2);
        courseGrades.setPassFailExam(passFailExam);

        System.out.println(courseGrades.toString());
        System.out.println("Avarage: " + courseGrades.getAverage());
        System.out.println("Highest Score: " + courseGrades.getHighest());
        System.out.println("Lowest Score: " + courseGrades.getLowest());




    }



}
