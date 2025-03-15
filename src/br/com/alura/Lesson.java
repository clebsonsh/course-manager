package br.com.alura;

public class Lesson implements Comparable<Lesson> {
    private String title;
    private int time;

    public Lesson(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTime() {
        return this.time;
    }

    @Override
    public String toString() {
        return "[Lesson:" + "title=" + title + ", time=" + time + ']';
    }

    @Override
    public int compareTo(Lesson otherLesson) {
        return this.title.compareTo(otherLesson.title);
    }
}
