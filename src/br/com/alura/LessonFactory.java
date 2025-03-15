package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class LessonFactory {
    public static void main(String[] args) {
        Lesson l1 = new Lesson("Revisitando ArrayList", 21);
        Lesson l2 = new Lesson("Listas de objetos", 20);
        Lesson l3 = new Lesson("Relacionamento de lista e objetos", 15);

        ArrayList<Lesson> lessons = new ArrayList<Lesson>();
        lessons.add(l1);
        lessons.add(l2);
        lessons.add(l3);

        lessons.forEach(lesson -> {
            System.out.println("Lesson: " + lesson);
        });

        lessons.sort(Comparator.comparing(Lesson::getTime));

        lessons.forEach(lesson -> {
            System.out.println("Lesson: " + lesson);
        });
    }
}
