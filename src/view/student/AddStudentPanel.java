package view;

import model.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentPanel extends JPanel {
        public AddStudentPanel() {
            JTextField name = new JTextField(10);
            JTextField surname = new JTextField(10);

            JButton addStudentButton = new JButton("Добавить");
            addStudentButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Student student = new Student(name.getText(), surname.getText());
                    Student.model.addRow( new Object[]{
                            student.getId(),
                            student.getName(),
                            student.getSurname()

                    });

                }
            });

            add(name);
            add(surname);
            add(addStudentButton);
            setVisible(true);
        }
}
