/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.timeutil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vmatheis
 */
public class TimeUtilProTest {

    public TimeUtilProTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of intToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDate() {
        System.out.println("intToLocalDate");
        LocalDate expResult = LocalDate.of(2004, 05, 31);
        LocalDate result = TimeUtilPro.intToLocalDate(20040531);
        assertEquals(expResult, result);
    }

    /**
     * Test of longToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDate() {
        System.out.println("longToLocalDate");
        int date = (int) 20040531L;
        LocalDate expResult = LocalDate.of(2004, 05, 31);
        LocalDate result = TimeUtilPro.longToLocalDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDate() {
        System.out.println("dateToLocalDate");
        Date dateTime = new Date(2004, 05, 31);
        LocalDate expResult = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate result = TimeUtilPro.dateToLocalDate(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of calendarToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDate() {
        System.out.println("calendarToLocalDate");
        Calendar dateTime = new GregorianCalendar(2004, 05, 31);
        LocalDate expResult = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate result = TimeUtilPro.calendarToLocalDate(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of intToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDateTime() {
        System.out.println("intToLocalDateTime");
        int date = 20040531;
        LocalDateTime expResult = LocalDateTime.of(2004, 05, 31, 00, 00);
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of longToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDateTime() {
        System.out.println("longToLocalDateTime");
        long date = 200405310256L;
        LocalDateTime expResult = LocalDateTime.of(2004, 05, 31, 02, 56);
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDateTime() {
        System.out.println("dateToLocalDateTime");
        Date dateTime = new Date(2004, 05, 31);
        LocalDateTime expResult = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of calendarToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDateTime() {
        System.out.println("calendarToLocalDateTime");
        Calendar dateTime = new GregorianCalendar(2004, 05, 31);
        LocalDateTime expResult = dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToInt() {
        System.out.println("localDateToInt");
        int expResult = 20040531;
        int result = TimeUtilPro.localDateToInt(LocalDate.of(2004, 5, 31));
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToInt() {
        System.out.println("localDateTimeToInt");
        int expResult = 20040531;
        int result = TimeUtilPro.localDateTimeToInt(LocalDateTime.of(2004, 05, 31, 0, 0));
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToLong() {
        System.out.println("localDateToLong");
        long expResult = 20040531L;
        long result = TimeUtilPro.localDateToLong(LocalDate.of(2004, 5, 31));
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToLong() {
        System.out.println("localDateTimeToLong");
        long expResult = 200405310256L;
        long result = TimeUtilPro.localDateTimeToLong(LocalDateTime.of(2004, 5, 31, 02, 56));
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToDate() {
        System.out.println("localDateToDate");
        LocalDate date = LocalDate.of(2004, 05, 31);
        Date expResult = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());;
        Date result = TimeUtilPro.localDateToDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToDate() {
        System.out.println("localDateTimeToDate");
        LocalDateTime dateTime = LocalDateTime.of(2004, 05, 31, 02, 56);
        Date expResult = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
        Date result = TimeUtilPro.localDateTimeToDate(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToCalendar() {
        System.out.println("localDateToCalendar");
        LocalDate date = LocalDate.of(2004, 05, 31);
        Calendar expResult = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));;
        Calendar result = TimeUtilPro.localDateToCalendar(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToCalendar() {
        System.out.println("localDateTimeToCalendar");
        LocalDateTime dateTime = LocalDateTime.of(2004, 05, 31, 02, 56);
        Calendar expResult = GregorianCalendar.from(dateTime.atZone(ZoneId.systemDefault()));;
        Calendar result = TimeUtilPro.localDateTimeToCalendar(dateTime);
        assertEquals(expResult, result);
    }

}
