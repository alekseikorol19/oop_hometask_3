import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student(1, "AAA", "AA", "A");
        Student s2 = new Student(2, "BBB", "BB", "B");
        Student s3 = new Student(3, "CCC", "CC", "C");
    
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(s1);
        studentGroup.addStudent(s2);
        studentGroup.addStudent(s3);

        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>());
        studentGroup2.addStudent(s3);
        studentGroup2.addStudent(s2);

        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>());
        studentGroup3.addStudent(s1);

        Stream stream = new Stream(new ArrayList<>());
        stream.addToStream(studentGroup);
        stream.addToStream(studentGroup3);

        Stream stream2 = new Stream(new ArrayList<>());
        stream2.addToStream(studentGroup);
        stream2.addToStream(studentGroup2);

        List<Stream> streamList = new ArrayList<>();

        streamList.add(stream2);
        streamList.add(stream);
        StreamService service = new StreamService(streamList);

        printListStream(streamList);
        printListStream(service.getSortedStreams());
        
        
        
        
    } 

    public static void printListStudent(StudentGroup sg){
        for (Student student : sg) {
            System.out.println(student);
        }
    }
    public static void printListStream(List<Stream> sl){
        for (Stream stream : sl) {
            System.out.println(stream);
        }
    }
}
