package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for (int grade : grades) {

            if (grade >= 38) {
                int nextGradeMultipleDeCinco = ((grade / 5) + 1) * 5;
                if (nextGradeMultipleDeCinco - grade < 3) {
                    roundedGrades.add(nextGradeMultipleDeCinco);
                } else {
                    roundedGrades.add(grade);
                }
            } else {
                roundedGrades.add(grade);
            }

        }
    return roundedGrades;
    }



    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(84);
        grades.add(29);
        grades.add(57);

        List<Integer> roundedGrades = gradingStudents(grades);

        System.out.println("Notas originales: " + grades);
        System.out.println("Notas redondeadas: " + roundedGrades);
    }




}