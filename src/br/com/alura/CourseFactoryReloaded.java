package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseFactoryReloaded {
    public static void main(String[] args) {
        Course javaCollections = new Course("Dominando as coleções do Java", "Paulo Silveira");

        javaCollections.addLesson(new Lesson("Revisitando ArrayList", 21));
        javaCollections.addLesson(new Lesson("Listas de objetos", 20));
        javaCollections.addLesson(new Lesson("Relacionamento de lista e objetos", 15));

        List<Lesson> immutableLessons = javaCollections.getLessons();

        System.out.println(immutableLessons);

        List<Lesson> lessons = new ArrayList<>(immutableLessons);

        Collections.sort(lessons);

        System.out.println(lessons);
        System.out.println(javaCollections);
    }
}
