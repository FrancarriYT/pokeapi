package com.todocodeacademy.pokeapi.controller;

import com.todocodeacademy.pokeapi.dto.PokemonDTO;
import com.todocodeacademy.pokeapi.repository.PokeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    private PokeApiClient pokeAPIClient;

    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemonInfo (@PathVariable ("pokemonId") int pokemonId ) {
        return pokeAPIClient.getPokemonInfo(pokemonId);
    }


}

