package ua.com.app.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Generic data access object for all of the entities.
 * @param <K> the type parameter
 * @param <V> the type parameter
 */
@NoRepositoryBean
public interface GenericDao<K extends Serializable, V>
    extends JpaRepository<V, K> {
}
