package christmas.domain;

import christmas.domain.calendar.DayChecker;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class DayCheckerTest {
    DayChecker checker = new DayChecker(LocalDate.of(2023, 12, 10)); // 일요일
    DayChecker specialDay = new DayChecker(LocalDate.of(2023, 12, 25)); // 일요일
    @Test
    void 날짜_범위안에_드는지_판단할수_있다() {
        // when & then
        assertThat(checker.isBetweenRange(LocalDate.of(2023, 12, 10), (LocalDate.of(2023, 12, 30))))
                .isEqualTo(true);
    }

    @Test
    void 평일을_판단할수_있다() {
        // when & then
        assertThat(checker.isWeekDay())
                .isEqualTo(true);
    }

    @Test
    void 스페셜데이를_판단할수_있다() {
        // when & then
        assertThat(specialDay.isSpecialDay())
                .isEqualTo(true);
    }
}