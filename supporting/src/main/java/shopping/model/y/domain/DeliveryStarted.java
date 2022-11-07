package shopping.model.y.domain;

import shopping.model.y.domain.*;
import shopping.model.y.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Long orderId;

    public DeliveryStarted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
