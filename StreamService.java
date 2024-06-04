import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streamGroup;

    public StreamService(List<Stream> streamGroup) {
        this.streamGroup = streamGroup;
    }

    public List<Stream> getSortedStreams(){
        List<Stream> groupStreams = new ArrayList<>(streamGroup);
        groupStreams.sort(new StreamComparator());
        return groupStreams;

    }

    
}
