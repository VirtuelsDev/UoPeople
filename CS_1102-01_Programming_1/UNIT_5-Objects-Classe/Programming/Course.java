import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private int totalEnrolledStudents;
    private List<Student> enrolledStudents;

    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.totalEnrolledStudents = 0;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        if (totalEnrolledStudents < maxCapacity) {
            enrolledStudents.add(student);
            totalEnrolledStudents++;
            System.out.println("Student enrolled successfully.");
        } else {
            System.out.println("Course is full. Cannot enroll more students.");
        }
    }
}
