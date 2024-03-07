import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManagement {
    private static List<Course> courses = new ArrayList<>();

    public static void addCourse(Course course) {
        courses.add(course);
    }

    public static void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Administrator Interface:");
            System.out.println("1. Add a new course");
            System.out.println("2. Enroll students");
            System.out.println("3. Assign grades"); // To be implemented
            System.out.println("4. Calculate overall course grades"); // To be implemented
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter course code:");
                    String courseCode = scanner.nextLine();
                    System.out.println("Enter course name:");
                    String courseName = scanner.nextLine();
                    System.out.println("Enter maximum capacity:");
                    int maxCapacity = scanner.nextInt();
                    Course newCourse = new Course(courseCode, courseName, maxCapacity);
                    addCourse(newCourse);
                    System.out.println("Course added successfully.");
                    break;
                case 2:
                    displayCourses();
                    System.out.println("Enter the course code to enroll students:");
                    String code = scanner.nextLine();
                    Course selectedCourse = null;
                    for (Course course : courses) {
                        if (course.getCourseCode().equals(code)) {
                            selectedCourse = course;
                            break;
                        }
                    }
                    if (selectedCourse != null) {
                        System.out.println("Enter student name:");
                        String studentName = scanner.nextLine();
                        System.out.println("Enter student ID:");
                        int studentId = scanner.nextInt();
                        Student student = new Student(studentName, studentId);
                        selectedCourse.enrollStudent(student);
                    } else {
                        System.out.println("Invalid course code.");
                    }
                    break;
                case 3:
                    // Implement assigning grades
                    break;
                case 4:
                    // Implement calculating overall course grades
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
