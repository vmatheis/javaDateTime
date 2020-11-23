package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import sun.util.calendar.Gregorian;

public class TimeUtilPro {

    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    public static LocalDate intToLocalDate(int date) {
        String data = String.valueOf(date);
        return LocalDate.of(Integer.parseInt(data.substring(0, 4)), Integer.parseInt(data.substring(4, 6)), Integer.parseInt(data.substring(6, 8)));
    }

    public static LocalDate longToLocalDate(long dateTime) {
        String data = String.valueOf(dateTime);
        return LocalDate.of(Integer.parseInt(data.substring(0, 4)), Integer.parseInt(data.substring(4, 6)), Integer.parseInt(data.substring(6, 8)));
    }

    public static LocalDate dateToLocalDate(Date dateTime) {
        return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    // ########## LOCALDATETIME METHODS ##########
    public static LocalDateTime intToLocalDateTime(int date) {
        String data = String.valueOf(date);
        return LocalDateTime.of(Integer.parseInt(data.substring(0, 4)), Integer.parseInt(data.substring(4, 6)), Integer.parseInt(data.substring(6, 8)), 00, 00);
    }

    public static LocalDateTime longToLocalDateTime(long dateTime) {
        String data = String.valueOf(dateTime);
        return LocalDateTime.of(Integer.parseInt(data.substring(0, 4)), Integer.parseInt(data.substring(4, 6)), Integer.parseInt(data.substring(6, 8)), Integer.parseInt(data.substring(8, 10)), Integer.parseInt(data.substring(10, 12)));
    }

    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    // ########## INT METHODS ##########
    public static int localDateToInt(LocalDate date) {
        if (date.getMonthValue() < 10) {
            String data = date.getYear() + "0" + date.getMonthValue() + "" + date.getDayOfMonth();
            return Integer.parseInt(data);
        } else {
            String data = date.getYear() + "" + date.getMonthValue() + "" + date.getDayOfMonth();
            return Integer.parseInt(data);
        }
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        String data = dateTime.toString();
        data = data.replace("-", "").replace("T", "").replace(":", "");
        return Integer.parseInt(data.substring(0, 8));
    }

    // ########## LONG METHODS ##########
    public static long localDateToLong(LocalDate date) {
        if (date.getMonthValue() < 10) {
            String data = date.getYear() + "0" + date.getMonthValue() + "" + date.getDayOfMonth();
            return Integer.parseInt(data);
        } else {
            String data = date.getYear() + "" + date.getMonthValue() + "" + date.getDayOfMonth();
            return Integer.parseInt(data);
        }
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        String data = dateTime.toString();
        data = data.replace("-", "").replace("T", "").replace(":", "");
        return Long.parseLong(data);
    }

    // ########## DATE METHODS ##########
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    // ########## CALENDAR METHODS ##########
    public static Calendar localDateToCalendar(LocalDate date) {
        return GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        return GregorianCalendar.from(dateTime.atZone(ZoneId.systemDefault()));
    }

}
