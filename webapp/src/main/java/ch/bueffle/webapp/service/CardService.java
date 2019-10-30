package main.java.ch.bueffle.webapp.service;

//import ch.bueffle.webapp.service.ICardService;
import ch.bueffle.webapp.model.Cards;
import ch.bueffle.webapp.repository.CardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService implements ICardService {

    @Autowired
    private CardRepository repository;

    @Override
    public List<Cards> findAll() {

        return (List<Cards>) repository.findAll();
    }
}