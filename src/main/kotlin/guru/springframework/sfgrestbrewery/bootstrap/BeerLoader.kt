package guru.springframework.sfgrestbrewery.bootstrap

import guru.springframework.sfgrestbrewery.domain.Beer
import guru.springframework.sfgrestbrewery.domain.BeerStyleEnum
import guru.springframework.sfgrestbrewery.repositories.BeerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.math.BigDecimal
import java.util.*

@Component
class BeerLoader(private val beerRepository: BeerRepository) : CommandLineRunner {

    val BEER_1_UPC = "0631234200036"
    val BEER_2_UPC = "9122089364369"
    val BEER_3_UPC = "0083783375213"
    val BEER_4_UPC = "4666337557578"
    val BEER_5_UPC = "8380495518610"
    val BEER_6_UPC = "5677465691934"
    val BEER_7_UPC = "5463533082885"
    val BEER_8_UPC = "5339741428398"
    val BEER_9_UPC = "1726923962766"
    val BEER_10_UPC = "8484957731774"
    val BEER_11_UPC = "6266328524787"
    val BEER_12_UPC = "7490217802727"
    val BEER_13_UPC = "8579613295827"
    val BEER_14_UPC = "2318301340601"
    val BEER_15_UPC = "9401790633828"
    val BEER_16_UPC = "4813896316225"
    val BEER_17_UPC = "3431272499891"
    val BEER_18_UPC = "2380867498485"
    val BEER_19_UPC = "4323950503848"
    val BEER_20_UPC = "4006016803570"
    val BEER_21_UPC = "9883012356263"
    val BEER_22_UPC = "0583668718888"
    val BEER_23_UPC = "9006801347604"
    val BEER_24_UPC = "0610275742736"
    val BEER_25_UPC = "6504219363283"
    val BEER_26_UPC = "7245173761003"
    val BEER_27_UPC = "0326984155094"
    val BEER_28_UPC = "1350188843012"
    val BEER_29_UPC = "0986442492927"
    val BEER_30_UPC = "8670687641074"

    override fun run(vararg args: String?) {
        loadBeerObjects()
    }

    private fun loadBeerObjects() {
        if (beerRepository.count() == 0L) {

            val random = Random()

            beerRepository.save(
                Beer(
                    beerName = "Mango Bobs",
                    beerStyle = BeerStyleEnum.ALE,
                    upc = BEER_1_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Galaxy Cat",
                    beerStyle = BeerStyleEnum.PALE_ALE,
                    upc = BEER_2_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "No Hammers On The Bar",
                    beerStyle = BeerStyleEnum.WHEAT,
                    upc = BEER_3_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Blessed",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_4_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Adjunct Trail",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_5_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Very GGGreenn",
                    beerStyle = BeerStyleEnum.IPA,
                    upc = BEER_6_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Double Barrel Hunahpu's",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_7_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Very Hazy",
                    beerStyle = BeerStyleEnum.IPA,
                    upc = BEER_8_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "SR-71",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_9_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Pliny the Younger",
                    beerStyle = BeerStyleEnum.IPA,
                    upc = BEER_10_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Blessed",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_11_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "King Krush",
                    beerStyle = BeerStyleEnum.IPA,
                    upc = BEER_12_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "PBS Porter",
                    beerStyle = BeerStyleEnum.PORTER,
                    upc = BEER_13_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Pinball Porter",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_14_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Golden Budda",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_15_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Grand Central Red",
                    beerStyle = BeerStyleEnum.LAGER,
                    upc = BEER_16_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Pac-Man",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_17_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Ro Sham Bo",
                    beerStyle = BeerStyleEnum.IPA,
                    upc = BEER_18_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Summer Wheatly",
                    beerStyle = BeerStyleEnum.WHEAT,
                    upc = BEER_19_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Java Jill",
                    beerStyle = BeerStyleEnum.LAGER,
                    upc = BEER_20_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Bike Trail Pale",
                    beerStyle = BeerStyleEnum.PALE_ALE,
                    upc = BEER_21_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "N.Z.P",
                    beerStyle = BeerStyleEnum.IPA,
                    upc = BEER_22_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Strawberry Blond",
                    beerStyle = BeerStyleEnum.WHEAT,
                    upc = BEER_23_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Loco",
                    beerStyle = BeerStyleEnum.PORTER,
                    upc = BEER_24_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Spocktoberfest",
                    beerStyle = BeerStyleEnum.STOUT,
                    upc = BEER_25_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Beach Blond Ale",
                    beerStyle = BeerStyleEnum.ALE,
                    upc = BEER_26_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Bimini Twist IPA",
                    beerStyle = BeerStyleEnum.IPA,
                    upc = BEER_27_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Rod Bender Red Ale",
                    beerStyle = BeerStyleEnum.ALE,
                    upc = BEER_28_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "Floating Dock",
                    beerStyle = BeerStyleEnum.SAISON,
                    upc = BEER_29_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            beerRepository.save(
                Beer(
                    beerName = "El Hefe",
                    beerStyle = BeerStyleEnum.WHEAT,
                    upc = BEER_30_UPC,
                    price = BigDecimal(random.nextInt(10_000)),
                    quantityOnHand = random.nextInt(5000)
                )
            )

            println("Beer Records loaded: ${beerRepository.count()}")
        }
    }
}