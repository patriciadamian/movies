package ro.ubbcluj.movies.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;
import ro.ubbcluj.movies.core.model.BaseEntity;

import java.io.Serializable;

/**
 * Created by Patri on 6/16/2016.
 */

@NoRepositoryBean
@Transactional
public interface Repository<T extends BaseEntity<ID>, ID extends Serializable> extends JpaRepository<T, ID>{
}
