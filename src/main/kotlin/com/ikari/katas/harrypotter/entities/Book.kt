package com.ikari.katas.harrypotter.entities

sealed class Book(val title:String, val price:Double) {
    class HarryPotterI : Book("The Sorcery Stone",8.0)
    class HarryPotterII : Book("The Chamber of Secrets",8.0)
    class HarryPotterIII : Book("The Prisoner of Azkaban",8.0)
    class HarryPotterIV : Book("The Goblet of Fire",8.0)
    class HarryPotterV : Book("The Phoenix Order",8.0)
}