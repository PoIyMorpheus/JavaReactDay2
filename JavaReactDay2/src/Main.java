public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(0, "Yazılım geliştirici yetiştirme kampı(C# + Angular)", "Engin Demirog", "C# + Angular kursu...");
        Course course2 = new Course(1, "Yazılım geliştirici yetiştirme kampı(Java + React)", "Engin Demirog", "Java + React kursu...");

        Course[] courses = {course1,course2};

        Student student1 = new Student(0, "Batuhan", "Dikmen", "bd_mail@gmail.com");
        Student student2 = new Student(1, "Ali", "Veli", "av_mail@gmail.com");

        Student[] students = {student1,student2};

        for(Course course:courses){
            System.out.println(course.name);
        }

        for (Student student:students){
            System.out.println(student.name+" "+student.surname);
        }

        CourseManager courseManager = new CourseManager();

        courseManager.addToDatabase(course1);
        courseManager.deleteFromDatabase(course1);

        StudentManager studentManager = new StudentManager();

        studentManager.addToDatabase(student1);
        studentManager.deleteFromDatabase(student1);
    }
}
