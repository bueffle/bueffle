package ch.bueffle.webapp.service;

import ch.bueffle.webapp.model.Cards;

import java.util.List;

public interface ICardService {

    List<Cards> findAll();
}