package com.benboonya.pokemoninfo

import android.app.Application
import com.benboonya.pokemoninfo.common.di.netModule
import com.benboonya.pokemoninfo.pokemon.di.pokemonModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

val modules = listOf(netModule, pokemonModule)

class PokemonApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@PokemonApplication)
            modules(modules)
        }
    }
}