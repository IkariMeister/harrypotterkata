package com.ikari.katas.harrypotter

import com.ikari.katas.harrypotter.entities.Book
import com.ikari.katas.harrypotter.entities.BookSet

class BookStore(private val bookSet: MutableList<BookSet> = mutableListOf()) {

    fun price() = bookSet.sumByDouble { it.price() }

    fun addBook(book: Book) : BookStore{
        if(bookSet.isEmpty()){
            bookSet.add(BookSet(listOf(book)))
            return this
        }
        else {
            val it = bookSet.iterator()
            while (it.hasNext()) {
                var set = it.next()
                if (!set.isFull()&&set.canAdd(book)) {
                    bookSet.remove(set)
                    set = set.addBook(book)
                    bookSet.add(set)
                    return this
                }
            }
            bookSet.add(BookSet(listOf(book)))
            return this
        }
    }

}


