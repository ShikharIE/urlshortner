package repository;

import model.UrlMapper;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlMapperRepo extends CrudRepository<UrlMapper,String>, QuerydslPredicateExecutor<UrlMapper> {
}
