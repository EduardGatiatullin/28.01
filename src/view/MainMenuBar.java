package view;

import view.course.AddCoursePanel;
import view.student.AddStudentFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuBar extends JMenuBar {
    public MainMenuBar(){
        add(fileMenu());
        add(helpMenu());
    }
    private JMenu fileMenu() {
        JMenu file = new JMenu("Файл");
        JMenu newItem = new JMenu("Новый");
        JMenu settings = new JMenu("Настройки");
        JMenu leave = new JMenu("Выход");
        JMenuItem newStudent = new JMenuItem("Студент");
        JMenuItem newCourse = new JMenuItem("Курс");

        file.add(newItem);
        newItem.add(newStudent);
        newItem.add(newCourse);
        file.add(settings);
        file.add(leave);

        newStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddStudentFrame();
            }
        });

        newCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCoursePanel();
            }
        });
        return file;
    }
    private JMenu helpMenu() {
        JMenu help = new JMenu("Помомщь");
        JMenuItem aboutProg = new JMenuItem("О программе");
        JMenuItem recovery = new JMenuItem("Справка");

        help.add(aboutProg);
        help.add(recovery);
        return help;
    }
}
