package christmas.domain.calendar;

import java.time.DayOfWeek;

public enum WeekDay {
    MONDAY(DayOfWeek.MONDAY),
    TUESDAY(DayOfWeek.TUESDAY),
    WEDNESDAY(DayOfWeek.WEDNESDAY),
    THURSDAY(DayOfWeek.THURSDAY),
    SUNDAY(DayOfWeek.SUNDAY);

    private final DayOfWeek dayOfWeek;

    WeekDay(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeek getDayOfWeek() {
        return this.dayOfWeek;
    }

    public static boolean isWeekDate(DayOfWeek day) {
        for (WeekDay weekdate : WeekDay.values()) {
            if (weekdate.getDayOfWeek() == day) {
                return true;
            }
        }
        return false;
    }
}

