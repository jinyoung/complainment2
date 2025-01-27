package complainment.infra;

import complainment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 주문HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<주문>> {

    @Override
    public EntityModel<주문> process(EntityModel<주문> model) {
        return model;
    }
}
