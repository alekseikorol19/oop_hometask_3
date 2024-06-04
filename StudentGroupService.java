import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    
    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentGroup());
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentGroupByFio(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentGroup());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
