package view;

import view.course.AddCourseFrame;
import view.course.AddCoursePanel;
import view.course.CourseListPanel;
import view.student.AddStudentPanel;
import view.student.StudentListPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("LMS");
        setSize(500, 500);
        setLocation(300, 300);
        setLayout(new FlowLayout());
        add(new AddStudentPanel());
        setJMenuBar(new MainMenuBar());
        add(new StudentListPanel());
        add(new AddCoursePanel());
        add(new CourseListPanel());



        setVisible(true);
    }
}
