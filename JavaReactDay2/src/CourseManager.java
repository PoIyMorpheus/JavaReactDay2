public class CourseManager {

    public void addToDatabase(Course course){
        System.out.println(course.name+" adlı kurs veritabanına eklendi.");
    }
    public void deleteFromDatabase(Course course){
        System.out.println(course.name+ "adlı kurs veritabanından kaldırıldı.");
    }
}
