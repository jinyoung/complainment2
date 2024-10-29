package complainment.domain;

import complainment.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "게시물", path = "게시물")
public interface 게시물Repository
    extends PagingAndSortingRepository<게시물, Long> {}
