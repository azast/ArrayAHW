package com.company;

public class Main {

    public static void main(String[] args) {
        //Homework 2
        String[] Students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] Grades = {"D", "D", "B", "A"};


        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals("Charlie")) {
                System.out.println(Grades[i]);
            }
        }
    }
    }
