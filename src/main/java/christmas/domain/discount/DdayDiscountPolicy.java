package christmas.domain.discount;

import christmas.domain.DayChecker;
import christmas.domain.Orders;
import christmas.domain.discount.DiscountPolicy;

import java.time.LocalDate;

public class DdayDiscountPolicy implements DiscountPolicy {
    private LocalDate start = LocalDate.of(2023, 12, 1);
    private LocalDate end = LocalDate.of(2023, 12, 25);

    @Override
    public int calculateDiscountAmount(Orders orders) {
        LocalDate orderDate = orders.getDate();
        if (!isValidForCondition(orderDate))
            return 0;
        return 1000 + 100 * (orderDate.getDayOfMonth() - start.getDayOfMonth());
    }

    @Override
    public boolean isValidForCondition(LocalDate date) {
        DayChecker dayChecker = new DayChecker(date);
        return dayChecker.isBetweenRange(start, end);
    }
}