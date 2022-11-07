package shopping.model.y.domain;

import shopping.model.y.domain.*;
import shopping.model.y.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InventoryDeducted extends AbstractEvent {

    private Long id;
    private String name;
    private Long qty;

    public InventoryDeducted(Product aggregate){
        super(aggregate);
    }
    public InventoryDeducted(){
        super();
    }
}
