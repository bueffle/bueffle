package ch.bueffle.webapp.repository;

import ch.bueffle.webapp.model.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Cards, Long> {

}