package com.ikari.katas.harrypotter

import com.ikari.katas.harrypotter.entities.Book
import com.ikari.katas.harrypotter.entities.BookSet

class BookStore(private val bookSet: List<BookSet> = listOf()) {

    val price by lazy { bookSet.sumByDouble { it.price } }

    fun addBook(book: Book): BookStore {
        return when {
            bookSet.isEmpty() -> BookStore(bookSet.plus(BookSet(listOf(book))))
            else -> BookStore(bookSet
                    - (bookSet.find { !it.isFull() && it.canAdd(book) }?:BookSet())
                    + (bookSet.find { !it.isFull() && it.canAdd(book) } ?: BookSet()).addBook(book))
        }
    }

}


