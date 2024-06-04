import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> stream;

    public Stream(List<StudentGroup> stream) {
        this.stream = stream;
    }
    
    public List<StudentGroup> getStream() {
        return stream;
    }

    public void addToStream(StudentGroup studentGroup) {
        stream.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(stream);
    }

    @Override
    public String toString() {
        return "Stream [stream=" + stream + "]";
    }
    
    
}
