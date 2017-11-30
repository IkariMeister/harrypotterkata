package com.ikari.katas.harrypotter

import com.ikari.katas.harrypotter.entities.Book
import spock.lang.Specification


class BookStoreTest extends Specification {

    def "Sell a Book price is 8.0"() {
        given: 'A BookStore and a Harry Potter Book'
            BookStore store = new BookStore()
        when: 'add a book'
            store = store.addBook(new Book.HarryPotterI())
        then: 'price is 8.0'
            store.price == 8.0
    }

    def "Sell two equals Books price is 16.0"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add the same book again'
        store = store.addBook(new Book.HarryPotterI())
        then: 'price is 16.0'
        store.price == 16.0
    }

    def "Sell two diferent Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add another different book '
        store = store.addBook(new Book.HarryPotterII())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell three diferent Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add another different book '
        store = store.addBook(new Book.HarryPotterII())
        and: 'add another different book '
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 21.6'
        store.price == 21.6
    }

}