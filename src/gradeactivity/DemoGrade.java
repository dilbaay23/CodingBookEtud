package gradeactivity;

import gradeactivity.Essay;

import java.util.Scanner;

public class DemoGrade {
    public static void main(String[] args) {
    //    Scanner scanner=new Scanner(System.in);

        
//        Essay essay= new Essay(40,19,19,30);
//        System.out.println(essay.getGrade());

        CourseGrades courseGrades = new CourseGrades();

        GradedActivity gradedActivity = new GradedActivity(70);
        courseGrades.setLab(gradedActivity);

        Essay essay = new Essay(75);
        courseGrades.setEssay(essay);

        FinalExam finalExam = new FinalExam(43);
        courseGrades.setFinalExam(finalExam);

        PassFailExam passFailExam = new PassFailExam(6);
        courseGrades.setPassFailExam(passFailExam);

        System.out.println(courseGrades.toString());




    }



}
