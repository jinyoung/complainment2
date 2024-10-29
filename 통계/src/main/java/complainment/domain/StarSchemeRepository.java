package complainment.domain;

import complainment.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "starSchemes",
    path = "starSchemes"
)
public interface StarSchemeRepository
    extends PagingAndSortingRepository<StarScheme, Long> {}
