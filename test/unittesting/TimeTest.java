package unittesting;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zein
 */
public class TimeTest {

    private final Time time;
    
    public TimeTest() {
        time = new Time(0, 0, 0);
    }
    
    @Test
    public void testCanIncrementSecond() {
        time.setTime(0, 0, 0);
        time.nextSecond();

        assertEquals("00:00:00 !=> 00:00:01", 1, time.getSecond());
    }

    @Test
    public void testCanIncrementMinute() {
        time.setTime(10, 0, 59);
        time.nextSecond();

        assertEquals("10:00:59 !=> 10:01:00", 1, time.getMinute());
    }

    @Test
    public void testCanIncrementHour() {
        time.setTime(10, 59, 59);
        time.nextSecond();

        assertEquals("10:59:59 !=> 11:00:00", 11, time.getHour());
    }

    @Test
    public void testCanIncrementDay() {
        time.setTime(23, 59, 59);
        time.nextSecond();

        assertEquals("23:59:59 !=> 00:00:00", 0, time.getHour());
    }
    
    @Test
    public void testCanDecrementMinute() {
        time.setTime(10, 1, 0);
        time.previousSecond();

        assertEquals("10:01:00 !=> 10:00:59", 0, time.getMinute());
    }

    @Test
    public void testCanDecrementHour() {
        time.setTime(10, 0, 0);
        time.previousSecond();

        assertEquals("10:00:00 !=> 09:59:59", 9, time.getHour());
    }

    @Test
    public void testCanDecrementDay() {
        time.setTime(0, 0, 0);
        time.previousSecond();

        assertEquals("00:00:00 !=> 23:59:59", 23, time.getHour());
        assertEquals("00:00:00 !=> 23:59:59", 59, time.getMinute());
        assertEquals("00:00:00 !=> 23:59:59", 59, time.getSecond());
    }

    @Test
    public void testShowTimeCorrectly() {
        time.setTime(10, 30, 0);

        assertEquals("10:30:00", time.toString());
    }
}
