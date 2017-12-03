package com.ikari.katas.harrypotter.entities

class BookSet(private val books: List<Book> = listOf()) {
    private val discount: Double = when (books.size) {
        5 -> 0.25
        4 -> 0.2
        3 -> 0.1
        2 -> 0.05
        else -> 0.0
    }

    val price by lazy { (1.0 - discount) * books.sumByDouble { it.price } }


    fun addBook(book: Book) =
            when {
                canAdd(book) -> BookSet(books.plus(book))
                else -> this
            }


    fun canAdd(book: Book) = books.find { it.javaClass == book.javaClass } == null

    fun isFull() = books.size >= 5
}