package Introduction;

import java.text.*;
import java.util.*;

public class JavaDateAndTime {
    public static String findDay(int month, int day, int year) {
        return new SimpleDateFormat("EEEE")
                .format(new Date(year - 1900, month - 1, day))
                .toUpperCase();
    }
}
