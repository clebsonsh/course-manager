package br.com.alura;

public class Student {
    private String name;
    private int registrationNumber;

    public Student(String name, int registrationNumber) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }

        if (registrationNumber < 0) {
            throw new NullPointerException("Registration number cannot be negative");
        }

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

    @Override
    public boolean equals(Object obj) {
        Student otherStudent = (Student) obj;

        return this.name.equals(otherStudent.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
