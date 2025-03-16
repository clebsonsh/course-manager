package br.com.alura;

public class StudentFactory {
    public static void main(String[] args) {
        Course javaCollections = new Course("Dominando as coleções do Java", "Paulo Silveira");

        javaCollections.addLesson(new Lesson("Revisitando ArrayList", 21));
        javaCollections.addLesson(new Lesson("Listas de objetos", 20));
        javaCollections.addLesson(new Lesson("Relacionamento de lista e objetos", 15));

        Student s1 = new Student("Rodrigo Turini", 34673);
        Student s2 = new Student("Alberto Souza", 83453);
        Student s3 = new Student("Mauricio Aniche", 21450);

        javaCollections.addStudent(s1);
        javaCollections.addStudent(s2);
        javaCollections.addStudent(s3);

        System.out.println("All students registered for this course:");
        javaCollections.getStudents().forEach(System.out::println);

        System.out.println("Student " + s1 + " registered for this course:");
        System.out.println(javaCollections.isStudentRegistered(s1));

        Student turini = new Student("Rodrigo Turini", 34673);

        System.out.println("Student s1 = Turini?");
        System.out.println(s1.equals(turini));
        System.out.println(s1.hashCode() == turini.hashCode());
    }
}
