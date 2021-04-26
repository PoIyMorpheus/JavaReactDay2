public class StudentManager {
    public void addToDatabase(Student student){
        System.out.println(student.name+" "+student.surname+" adlı öğrenci veritabanına eklendi.");
    }
    public void deleteFromDatabase(Student student){
        System.out.println(student.name+" "+student.surname+ "adlı öğrenci veritabanından kaldırıldı.");
    }
}
