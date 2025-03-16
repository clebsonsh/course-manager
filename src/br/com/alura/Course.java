package br.com.alura;

import java.util.*;

public class Course {
    private String name;
    private String instructor;
    private List<Lesson> lessons = new LinkedList<>();
    private Set<Student> students = new HashSet<>();

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return this.name;
    }

    public String getInstructor() {
        return this.instructor;
    }

    public List<Lesson> getLessons() {
        return Collections.unmodifiableList(this.lessons);
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(this.students);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getTotalTime() {
        return this.lessons.stream().mapToInt(Lesson::getTime).sum();
    }

    @Override
    public String toString() {
        return "[Course: " + this.name + ", total time: " + this.getTotalTime() + ", Lessons: " + this.getLessons() + "]";
    }
}
