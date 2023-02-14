package DZ.Test;

import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.coverage.SomeService;

class DZSomeServiceTest {
    private SomeService someService;

    DZSomeServiceTest() {
    }

    @BeforeEach
    void setUp() {
        this.someService = new SomeService();
    }

    @Test
    void discountTest() {
        System.out.println(this.someService.calculatingDiscount(2000.0, 10));
        Assertions.assertThat(this.someService.calculatingDiscount(2000.0, 50)).isEqualTo(1000.0);
        Assertions.assertThat(this.someService.calculatingDiscount(2000.0, 100)).isEqualTo(0.0);
        Assertions.assertThat(this.someService.calculatingDiscount(2000.0, 0)).isEqualTo(2000.0);
    }

    @Test
    void discountOverTest() {
        ((AbstractThrowableAssert)Assertions.assertThatThrownBy(() -> {
            this.someService.calculatingDiscount(2000.0, 110);
        }).isInstanceOf(ArithmeticException.class)).hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void negativeDiscountTest() {
        ((AbstractThrowableAssert)Assertions.assertThatThrownBy(() -> {
            this.someService.calculatingDiscount(2000.0, -10);
        }).isInstanceOf(ArithmeticException.class)).hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }

    @Test
    void negativePurchaseAmountTest() {
        ((AbstractThrowableAssert)Assertions.assertThatThrownBy(() -> {
            this.someService.calculatingDiscount(-100.0, 10);
        }).isInstanceOf(ArithmeticException.class)).hasMessage("Сумма покупки не может быть отрицательной");
    }
}
