import java.text.SimpleDateFormat;

/**
 * @author Povilas Pupkys
 * @project imdb-testing
 */

public class Timestamp {

    public static String getTimeStamp(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        java.sql.Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());
        String time = sdf.format(timestamp);
       return time;
    }
}
