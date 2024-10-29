package complainment.infra;

import complainment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 게시물HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<게시물>> {

    @Override
    public EntityModel<게시물> process(EntityModel<게시물> model) {
        return model;
    }
}
