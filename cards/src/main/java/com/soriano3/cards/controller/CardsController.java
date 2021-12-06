package com.soriano3.cards.controller;

import com.soriano3.cards.model.Card;
import com.soriano3.cards.model.Customer;
import com.soriano3.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {
    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Card> getCardDetails(@RequestBody Customer customer) {
        List<Card> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
        if (cards.size() == 0 || cards == null) {
            return null;
        }
        return cards;
    }
}
