package spring.anythingjava.domain.order;

import java.util.Objects;

public class OrderNo {
    private String number;

    public OrderNo() {
    }

    public OrderNo(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderNo orderNo = (OrderNo) o;
        return number.equals(orderNo.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
