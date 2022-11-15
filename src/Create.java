
import org.dizitart.no2.Nitrite;

public class Create {

    public static void main(String[] args) {
        var db = Nitrite.builder()
                .compressed()
                .filePath("students.db")
                .openOrCreate("admin", "password123");

        var student1 = new Student();
        student1.setName("Adi");
        student1.setNim("123123");
        student1.setAddress("Suhat Malang");

        var student2 = new Student();
        student2.setName("Budi");
        student2.setNim("234234");
        student2.setAddress("Veteran Malang");

        var studentRepo = db.getRepository(Student.class);
        studentRepo.insert(student1, student2);
    }
}
