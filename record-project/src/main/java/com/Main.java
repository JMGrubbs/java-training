package com;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++){
            StudentRecord s = new StudentRecord(
                ""+i,
                switch(i) {
                    case 1 -> "Mary";
                    case 2 -> "John";
                    case 3 -> "Tim";
                    case 4 -> "Lisa";
                    case 5 -> "Joe";
                    default -> "Anonymous";
                },
                "01-31-1999",
                 "history, bio"
            );
            System.out.println(s);
        }

        for (int i = 1; i < 5; i++){
            Student s = new Student(
                ""+i,
                switch(i) {
                    case 1 -> "Mary";
                    case 2 -> "John";
                    case 3 -> "Tim";
                    case 4 -> "Lisa";
                    case 5 -> "Joe";
                    default -> "Anonymous";
                },
                "01-31-1999",
                 "history, bio"
            );
            System.out.println(s);
        }


        Student pojoStudent = new Student(
            "1",
            "Ann",
            "01-31-1999",
            "java"
        );
        StudentRecord recordStudent = new StudentRecord(
            "1",
            "Tim",
            "01-31-1999",
            "java"
        );
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}