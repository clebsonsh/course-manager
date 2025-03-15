package br.com.alura;

public class CourseFactory {
    public static void main(String[] args) {
        Course javaCollections = new Course("Dominando as coleções do Java", "Paulo Silveira");

        javaCollections.addLesson(new Lesson("Revisitando ArrayList", 21));
        javaCollections.addLesson(new Lesson("Listas de objetos", 20));
        javaCollections.addLesson(new Lesson("Relacionamento de lista e objetos", 15));

        System.out.println("Lessons: " + javaCollections.getLessons());
    }
}
