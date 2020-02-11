package repository;

import model.Vendor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepo extends CrudRepository<Vendor,Integer>, QuerydslPredicateExecutor<Vendor> {
}
