import java.util.ArrayList;

public class AcademicPerformance {
   private int id;
   private int mark;
   private CourseEnrollment courseEnrollment;


    private static ArrayList<AcademicPerformance> list = new ArrayList<>();
    static int lastID = 0;

    public AcademicPerformance(int mark, CourseEnrollment courseEnrollment) {
        setMark(mark);
        this.courseEnrollment = courseEnrollment;
        this.id = ++lastID;
        list.add(this);
    }
    AcademicPerformance (Student student, Course course, int mark) {
        this(mark, CourseEnrollment.getCourseEnrollment(student, course));
    }
    void setMark (int mark) {
        if (mark < 1) mark = 1;
        if (mark > 100) mark = 100;
        this.mark = mark;
    }
    static ArrayList<Integer> getMarksByStudentAndCourse (Student student, Course course) {
        ArrayList<Integer> marks = new ArrayList<>();
        CourseEnrollment ce = CourseEnrollment.getCourseEnrollment(student, course);
        for ( AcademicPerformance ap : list) {
            if (ap.courseEnrollment == ce) {
                marks.add(ap.mark);
            }
        }
        return marks;
    }
}
