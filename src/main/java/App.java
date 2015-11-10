import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

/**
 * Created by bill on 11/10/15.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Job job = Job.getInstance();
        job.setJobName("some job name");
    }
}
