//package christmas.domain;
//
//import christmas.dto.OrdersDto;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.assertj.core.api.Assertions.assertThatThrownBy;
//
//class OrdersTest {
//
//    private OrdersDto orders = new OrdersDto();
//    private String main = "양송이스프";
//    private String drink = "제로콜라";
//    private String count = "1";
//
//    @Test
//    void 주문을_추가한다() {
//        // given
//        Item order1 = Item.createItem(main, count);
//        Item order2 = Item.createItem(drink, count);
//
//        // when & then
//        assertDoesNotThrow(() -> orders.addOrder(order1));
//        assertDoesNotThrow(() -> orders.addOrder(order2));
//        assertEquals(2, orders.getOrders().size());
//    }
//
//    @Test
//    void 최대주문_가능항목을_초과하면_예외가_발생한다() {
//        // given
//        String overCount = "11";
//        Item order = Item.createItem(main, overCount);
//        Item order2 = Item.createItem(main, overCount);
//        // when
//        orders.addOrder(order);
//        // then
//        assertThatThrownBy(() -> orders.addOrder(order2))
//                .isInstanceOf(IllegalArgumentException.class);
//    }
//
//    @Test
//    void 음료만_주문했을때는_예외가_발생한다() {
//        // when
//        Item drinkOrder = Item.createItem(drink, count);
//        // then
//        assertThrows(IllegalArgumentException.class, () -> orders.addOrder(drinkOrder));
//    }
//}
