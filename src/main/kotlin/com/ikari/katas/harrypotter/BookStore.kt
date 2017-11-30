package com.ikari.katas.harrypotter

import com.ikari.katas.harrypotter.entities.Book

class BookStore(private val books: List<Book> = listOf()) {

    val price = calculateBasePrice() * calculateDiscount()

    fun addBook(book: Book) = BookStore(books.plus(book))


    private fun calculateBasePrice() = books.size * 8.0

    private fun calculateDiscount():Double {
        val hp1 = mutableListOf<Book>()
        val hp2 = mutableListOf<Book>()
        val hp3 = mutableListOf<Book>()
        val hp4 = mutableListOf<Book>()
        val hp5 = mutableListOf<Book>()

        for(b in books){
            if(b is Book.HarryPotterI){
                hp1.add(b)
            }
            else if(b is Book.HarryPotterII){
                hp2.add(b)
            }else if(b is Book.HarryPotterIII){
                hp3.add(b)
            }else if(b is Book.HarryPotterIV){
                hp4.add(b)
            }else if(b is Book.HarryPotterV){
                hp5.add(b)
            }
        }
        return 0.0
    }

}