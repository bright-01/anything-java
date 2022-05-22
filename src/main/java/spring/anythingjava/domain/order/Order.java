package spring.anythingjava.domain.order;

import java.util.List;

public class Order {
    private OrderNo id;
    private List<OrderLine> orderLines;
    private OrderState state;
    private ShippingInfo shippingInfo;
    private Money totalAmounts;

    public void payment(){}
    public void shipped(){}
    public void startDelivery(){}
    public void completeDelivery(){}
    public void cancel(){}

    public void changeShippingInfo(ShippingInfo newShippingInfo){}
}
