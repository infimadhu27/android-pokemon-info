package com.benboonya.pokemoninfo.pokemon.usecase

import com.benboonya.pokemoninfo.pokemon.repository.PokemonRepository

class GetPokemonListUseCase(private val repository: PokemonRepository) {

    operator fun invoke() = repository.getPokemonList()
}