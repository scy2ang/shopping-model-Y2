package shopping.model.y.domain;

import shopping.model.y.domain.*;
import shopping.model.y.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String address;

    public OrderPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
