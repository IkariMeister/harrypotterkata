package com.ikari.katas.harrypotter.entities

sealed class Book(val title: String, val price: Double, val discount: Double) {
    class HarryPotterI(discount: Double = 0.0) : Book("The Sorcery Stone", 8.0, discount)
    class HarryPotterII(discount: Double = 0.0) : Book("The Chamber of Secrets", 8.0, discount)
    class HarryPotterIII(discount: Double = 0.0) : Book("The Prisoner of Azkaban", 8.0, discount)
    class HarryPotterIV(discount: Double = 0.0) : Book("The Goblet of Fire", 8.0, discount)
    class HarryPotterV(discount: Double = 0.0) : Book("The Phoenix Order", 8.0, discount)

    fun copy(discount: Double) =
            when (this) {
                is HarryPotterI -> HarryPotterI(discount)
                is HarryPotterII -> HarryPotterII(discount)
                is HarryPotterIII -> HarryPotterIII(discount)
                is HarryPotterIV -> HarryPotterIV(discount)
                is HarryPotterV -> HarryPotterV(discount)
            }
}