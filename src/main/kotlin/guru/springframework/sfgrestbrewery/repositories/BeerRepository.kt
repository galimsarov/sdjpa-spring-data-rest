package guru.springframework.sfgrestbrewery.repositories

import guru.springframework.sfgrestbrewery.domain.Beer
import guru.springframework.sfgrestbrewery.domain.BeerStyleEnum
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BeerRepository : JpaRepository<Beer, UUID> {
    fun findAllByBeerName(beerName: String, pageable: Pageable): Page<Beer>

    fun findAllByBeerStyle(beerStyle: BeerStyleEnum, pageable: Pageable): Page<Beer>

    fun findAllByBeerNameAndBeerStyle(beerName: String, beerStyle: BeerStyleEnum, pageable: Pageable): Page<Beer>

    fun findByUpc(upc: String): Beer
}