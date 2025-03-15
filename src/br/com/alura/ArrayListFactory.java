package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFactory {
    public static void main(String[] args) {
        String lesson1 = "Conhecendo mais de lista";
        String lesson2 = "Modelando a classe Aula";
        String lesson3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> lessons = new ArrayList<>();
        lessons.add(lesson1);
        lessons.add(lesson2);
        lessons.add(lesson3);

        System.out.println(lessons);

        lessons.remove(lesson1);

        for (String lesson : lessons) {
            System.out.println("Lesson: " + lesson);
        }

        String firstLesson = lessons.get(0);
        System.out.println("First lesson: " + firstLesson);

        for (int i = 0; i < lessons.size(); i++) {
            System.out.println("Lesson: " + lessons.get(i));
        }

        lessons.forEach(lesson -> {
            System.out.println("Lesson: " + lesson);
        });

        lessons.add("Aumentando nosso conhecimento");

        lessons.forEach(lesson -> {
            System.out.println("Lesson: " + lesson);
        });

        Collections.sort(lessons);

        lessons.forEach(lesson -> {
            System.out.println("Lesson: " + lesson);
        });
    }
}
