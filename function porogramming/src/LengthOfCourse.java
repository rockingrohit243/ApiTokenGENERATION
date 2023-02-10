import java.util.List;

public class LengthOfCourse {
    private static List<String> courses;

    public static void main(String[] args) {
        List<String> courses = List.of("java", "python", "aws", "c", "c++", "nodejs", "spring", "spring boot", "android");
        printingCourse(courses);
    }

    private static void printingCourse(List<String> courses) {
        LengthOfCourse.courses = courses;
        courses.stream().map( course->course + "is:" + course.length()).forEach(System.out::println);

    }


}
