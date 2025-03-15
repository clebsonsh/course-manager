package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Course {
    private String name;
    private String instructor;
    private List<Lesson> lessons = new LinkedList<>();

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
}
