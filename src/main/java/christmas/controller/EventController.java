package christmas.controller;

import christmas.domain.FoodItem;
import christmas.domain.order.Orders;
import christmas.domain.price.PriceCalculator;
import christmas.domain.price.money.KoreaMoney;
import christmas.domain.price.money.Money;
import java.util.List;

public class EventController {
    private final PriceCalculator priceCalculator;

    public EventController(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public List<FoodItem> receiveGift(Orders orders) {
        return priceCalculator.receiveGifts(orders);
    }

    public Money getOriginPrice(Orders orders) {
        return KoreaMoney.from(
                priceCalculator.calculateOriginalPrice(orders)
        );
    }
}
