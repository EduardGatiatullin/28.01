package model;

import java.util.ArrayList;

public class Course {
  private  String title;
  private  String description;
  private  int id;

    private static int lastID = 0;

    static ArrayList<Course> list = new ArrayList<>();

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
        this.id = ++lastID;
        list.add(this);
    }
    public String toString() {
        return this.title + this.description + this.id;
    }
    ArrayList<Student> getStudents() {
        return CourseEnrollment.getStudentByCourse(this);
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

