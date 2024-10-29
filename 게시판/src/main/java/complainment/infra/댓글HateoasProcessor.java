package complainment.infra;

import complainment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 댓글HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<댓글>> {

    @Override
    public EntityModel<댓글> process(EntityModel<댓글> model) {
        return model;
    }
}
