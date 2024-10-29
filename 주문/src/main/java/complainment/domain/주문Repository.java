package complainment.domain;

import complainment.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "주문", path = "주문")
public interface 주문Repository
    extends PagingAndSortingRepository<주문, Long> {}
