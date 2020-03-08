package lt.povilas.pupkys.test.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Povilas Pupkys
 * @project imdb-testing
 */

public class TimestampUtils {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy.MM.dd.HH.mm.ss");

    /**
     * Returns current time formatted as yyyy.MM.dd.HH.mm.ss
     *
     * @return String
     */
    public static String getCurrentTimestamp() {
        return LocalDateTime.now().format(DATE_TIME_FORMATTER);
    }
}
