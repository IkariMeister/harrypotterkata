package com.ikari.katas.harrypotter

import com.ikari.katas.harrypotter.entities.Book

class BookStore(private val books: List<Book> = listOf()) {

    val price = calculateBasePrice() * calculateDiscount()

    fun addBook(book: Book) = BookStore(books.plus(book))

    private fun calculateBasePrice() = books.size * 8.0

    private fun calculateDiscount(): Double {
        val hp1 = books.filter { it is Book.HarryPotterI }
        val hp2 = books.filter { it is Book.HarryPotterII }
        val hp3 = books.filter { it is Book.HarryPotterIII }
        val hp4 = books.filter { it is Book.HarryPotterIV }
        val hp5 = books.filter { it is Book.HarryPotterV }
        return 1.0 -
                when {
                    fiveBooks(hp1, hp2, hp3, hp4, hp5) -> 0.25
                    fourBooks(hp1, hp2, hp3, hp4, hp5) -> 0.2
                    threeBooks(hp1, hp2, hp3, hp4, hp5) -> 0.1
                    twoBooks(hp1, hp2, hp3, hp4, hp5) -> 0.05
                    else -> 0.0
                }
    }

    private fun twoBooks(hp1: List<Book>, hp2: List<Book>, hp3: List<Book>, hp4: List<Book>, hp5: List<Book>) =
            (hp1.isNotEmpty() && hp2.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp3.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp4.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp2.isNotEmpty() && hp3.isNotEmpty()) ||
                    (hp2.isNotEmpty() && hp4.isNotEmpty()) ||
                    (hp2.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp3.isNotEmpty() && hp4.isNotEmpty()) ||
                    (hp3.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp4.isNotEmpty() && hp5.isNotEmpty())

    private fun threeBooks(hp1: List<Book>, hp2: List<Book>, hp3: List<Book>, hp4: List<Book>, hp5: List<Book>) =
            (hp1.isNotEmpty() && hp2.isNotEmpty() && hp3.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp2.isNotEmpty() && hp4.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp2.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp2.isNotEmpty() && hp3.isNotEmpty() && hp4.isNotEmpty()) ||
                    (hp2.isNotEmpty() && hp3.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp2.isNotEmpty() && hp4.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp3.isNotEmpty() && hp4.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp3.isNotEmpty() && hp4.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp3.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp4.isNotEmpty() && hp5.isNotEmpty())

    private fun fourBooks(hp1: List<Book>, hp2: List<Book>, hp3: List<Book>, hp4: List<Book>, hp5: List<Book>) =
            (hp1.isNotEmpty() && hp2.isNotEmpty() && hp3.isNotEmpty() && hp4.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp2.isNotEmpty() && hp3.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp2.isNotEmpty() && hp3.isNotEmpty() && hp4.isNotEmpty() && hp5.isNotEmpty()) ||
                    (hp1.isNotEmpty() && hp3.isNotEmpty() && hp4.isNotEmpty() && hp5.isNotEmpty())

    private fun fiveBooks(hp1: List<Book>, hp2: List<Book>, hp3: List<Book>, hp4: List<Book>, hp5: List<Book>) =
            (hp1.size == hp2.size) && (hp1.size == hp3.size) && (hp1.size == hp4.size) && (hp1.size == hp5.size)

}


