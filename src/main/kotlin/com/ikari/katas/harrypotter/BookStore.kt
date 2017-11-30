package com.ikari.katas.harrypotter

import com.ikari.katas.harrypotter.entities.Book

interface BookStore{

    val price:Double

    fun addBook(book: Book):BookStore

}