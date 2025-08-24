package Tesda.Activity;

import java.util.Scanner;

public class Activity6_Ocampo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // title
        System.out.println("===================================");
        System.out.println("\tAverage Calculator");
        System.out.println("===================================");
        
        // number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();
        String[] student = new String [numberOfStudents]; // single dimensional array
        
        // number of subjects
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = sc.nextInt();
        sc.nextLine();
        String[] subject = new String [numberOfSubjects]; // single dimensional array
        
        //setting up grades input and array
        int[][] grades = new int [numberOfStudents][numberOfSubjects];
        System.out.println("");
        
        //specifying subjects for single array
        System.out.println("Enter subject names:");
        for (int i = 0; i < subject.length; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            subject[i] = sc.nextLine();
        }
        System.out.println("");
        
        //specifying student names for single array
        for (int i = 0; i < student.length; i++) {
            System.out.print("Name of Student " + (i+1) + ": ");
            student[i] = sc.nextLine();
            System.out.println("Enter grades for each subject: ");
            
            //specifying grades for multidimensional array
            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + ": ");
                grades[i][j] = sc.nextInt();
            }
            System.out.println("");
            sc.nextLine();
        }
        System.out.println("");
        
        // second title
        System.out.println("===================================");
        System.out.println("\tGrades Report");
        System.out.println("===================================");
        
        // table headers
        System.out.print("Student\t\t");
        for (String s : subject) {
            System.out.print(s + " ");
        }
        System.out.println("Average");
        
        // separator
        System.out.println("-----------------------------------");

        // grade report per student
        for (int i = 0; i < numberOfStudents; i++) {
            int totalGrades = 0;
            
            // student name
            System.out.print(student[i] + "\t\t");
            
            // grades
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(grades[i][j] + "\t");
                totalGrades += grades[i][j];
            }
            
            // average grade per student
            double average = totalGrades / numberOfSubjects;
            System.out.println(average);
        }
    }
}
