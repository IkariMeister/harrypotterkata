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

    def "Sell Harry Potter I and II Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter I and III Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter III book '
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter I and IV Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter IV book '
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter I and V Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter V book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter II and III Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book '
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter II and IV Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter IV book '
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter II and V Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter V book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter III and IV Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book '
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter III and V Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter V book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter IV and V Books price is 15.2"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 15.2'
        store.price == 15.2
    }

    def "Sell Harry Potter I, II and III Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter I, II and IV Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter I, II and V Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter I, III and IV Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter I, III and V Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter I, IV and V Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter II, III and IV Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter II, III and V Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter II, IV and V Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter III, IV and V Books price is 21.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price == 21.6
    }

    def "Sell Harry Potter I, II, III and IV Books price is 25.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 25.6'
        store.price == 25.6
    }

    def "Sell Harry Potter I, II, III and V Books price is 25.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 25.6'
        store.price == 25.6
    }

    def "Sell Harry Potter II, III, IV and V Books price is 25.6"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when:'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 25.6'
        store.price == 25.6
    }

    def "Sell Harry Potter I, II, III, IV and V Books price is 30"() {
        given: 'A BookStore and a Harry Potter Book'
        BookStore store = new BookStore()
        when: 'add a book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add another different book '
        store = store.addBook(new Book.HarryPotterII())
        and: 'add another different book '
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add another different book '
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add another different book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 30'
        store.price == 30
    }

}