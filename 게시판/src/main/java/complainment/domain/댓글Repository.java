package complainment.domain;

import complainment.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "댓글", path = "댓글")
public interface 댓글Repository
    extends PagingAndSortingRepository<댓글, Long> {}
