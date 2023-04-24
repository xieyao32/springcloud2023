import org.joda.time.DateTimeZone;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.util.TimeZone;

public class TestDemo {
    @Test
    public void test1(){
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
