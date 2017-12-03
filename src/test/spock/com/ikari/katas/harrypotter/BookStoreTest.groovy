package com.ikari.katas.harrypotter

import com.ikari.katas.harrypotter.entities.Book
import spock.lang.Specification


class BookStoreTest extends Specification {

    def "Sell Harry Potter I price is 8.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        then: 'price is 8.0'
        store.price() == 8.0D
    }

    def "Sell Harry Potter II price is 8.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        then: 'price is 8.0'
        store.price() == 8.0D
    }

    def "Sell Harry Potter III price is 8.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 8.0'
        store.price() == 8.0D
    }

    def "Sell Harry Potter IV price is 8.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 8.0'
        store.price() == 8.0D
    }

    def "Sell Harry Potter V price is 8.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 8.0'
        store.price() == 8.0D
    }

    def "Sell Harry Potter I and II Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter I and III Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter III book '
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter I and IV Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter IV book '
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter I and V Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter V book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter II and III Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book '
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter II and IV Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter IV book '
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter II and V Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter V book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter III and IV Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book '
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter III and V Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter V book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter IV and V Books price is 15.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book '
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 15.2'
        store.price() == 15.2D
    }

    def "Sell Harry Potter I, II and III Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter I, II and IV Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter I, II and V Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter I, III and IV Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter I, III and V Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter I, IV and V Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter II, III and IV Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter II, III and V Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter II, IV and V Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter III, IV and V Books price is 21.6"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 21.6'
        store.price() == 21.6D
    }

    def "Sell Harry Potter I, II, III and IV Books price is 25.6"() {
        given: 'A BookStore'
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
        store.price() == 25.6D
    }

    def "Sell Harry Potter I, II, III and V Books price is 25.6"() {
        given: 'A BookStore'
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
        store.price() == 25.6D
    }

    def "Sell Harry Potter II, III, IV and V Books price is 25.6"() {
        given: 'A BookStore'
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
        store.price() == 25.6D
    }

    def "Sell Harry Potter I, II, III, IV and V Books price is 30"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
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
        store.price() == 30
    }

    def "Sell Two Harry Potter I Books price is 16.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        then: 'price is 16.0'
        store.price() == 16.0D
    }

    def "Sell Two Harry Potter II Books price is 16.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        then: 'price is 16.0'
        store.price() == 16.0D
    }

    def "Sell Two Harry Potter III Books price is 16.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        then: 'price is 16.0'
        store.price() == 16.0D
    }

    def "Sell Two Harry Potter IV Books price is 16.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        then: 'price is 16.0'
        store.price() == 16.0D
    }

    def "Sell Two Harry Potter V Books price is 16.0"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        and: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 16.0'
        store.price() == 16.0D
    }

    def "Sell Two Harry Potter I and One Harry Potter II Books price is 23.2"() {
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        then: 'price is 23.2'
        store.price() == 23.2D
    }

    def "2 copies of the first book 2 copies of the second book 2 copies of the third book 1 copy of the fourth book 1 copy of the fifth book Answer: 51.20 EUR "(){
        given: 'A BookStore'
        BookStore store = new BookStore()
        when: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter I book'
        store = store.addBook(new Book.HarryPotterI())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter II book'
        store = store.addBook(new Book.HarryPotterII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter III book'
        store = store.addBook(new Book.HarryPotterIII())
        and: 'add a Harry Potter IV book'
        store = store.addBook(new Book.HarryPotterIV())
        and: 'add a Harry Potter V book'
        store = store.addBook(new Book.HarryPotterV())
        then: 'price is 51.20'
        store.price() == 51.20D
    }

}