package br.com.alura;

public class Student {
    private String name;
    private int registrationNumber;

    public Student(String name, int registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", registrationNumber=" + registrationNumber + "]";
    }
}
