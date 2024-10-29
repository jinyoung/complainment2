package complainment.domain;

import complainment.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "searchEngines",
    path = "searchEngines"
)
public interface SearchEngineRepository
    extends PagingAndSortingRepository<SearchEngine, Long> {}
