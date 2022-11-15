
import org.dizitart.no2.Nitrite;

public class Read {

    public static void main(String[] args) {
        var db = Nitrite.builder()
                .compressed()
                .filePath("students.db")
                .openOrCreate("admin", "password123");

        var studentRepo = db.getRepository(Student.class);

        for (var student : studentRepo.find()) {
            System.out.println(student);
        }
    }
}
