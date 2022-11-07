package shopping.model.y.infra;
import shopping.model.y.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ProductHateoasProcessor implements RepresentationModelProcessor<EntityModel<Product>>  {

    @Override
    public EntityModel<Product> process(EntityModel<Product> model) {

        
        return model;
    }
    
}
