import javax.swing.*;

public class MainMenuBar extends JMenuBar {
    public MainMenuBar(){

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
