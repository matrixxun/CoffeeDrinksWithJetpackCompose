package com.alexzh.coffeedrinks.data

interface CoffeeDrinkRepository {

    fun getCoffeeDrinks(): List<CoffeeDrink>

    fun getCoffeeDrink(id: Long): CoffeeDrink?

    fun updateCoffeeDrink(coffeeDrinkId: Long): Boolean
}
