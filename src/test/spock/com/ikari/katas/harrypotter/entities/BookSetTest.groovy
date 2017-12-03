package com.ikari.katas.harrypotter.entities

import spock.lang.Specification

class BookSetTest extends Specification {

    def "Add a Harry Potter I to an Empty BookSet, is added and price is 8.0 and discount is 0"(){
        given: "A new BookSet"
        BookSet bookSet = new BookSet()
        when: "A Harry Potter I Book is added"
        bookSet = bookSet.addBook(new Book.HarryPotterI())
        then: "is not Empty"
        !bookSet.books.isEmpty()
        and: "price is 8.0"
        bookSet.price ==8.0D
        and: "discount is 0"
        bookSet.discount == 0.0D
    }

    def "Add a Harry Potter I to a BookSet which already has a Harry Potter I Book, can't add and price is 8 and discount is 0"(){
        given: "A BookSet with a HarryPotter I Book"
        BookSet bookSet = new BookSet(Arrays.asList(new Book.HarryPotterI()))
        and: "A Harry Potter I Book"
        Book book = new Book.HarryPotterI()
        when: "A Harry Potter I Book is added"
        bookSet = bookSet.addBook(book)
        then: "you cannot add it"
        !bookSet.canAdd(book)
        and: "price is 8.0"
        bookSet.price ==8.0D
        and: "discount is 0"
        bookSet.discount == 0.0D
    }

    def "Add a Harry Potter II to a BookSet which already has a Harry Potter I Book price is 15.2 and discount is 0.05"(){
        given: "A BookSet with a HarryPotter I Book"
        BookSet bookSet = new BookSet(Arrays.asList(new Book.HarryPotterI()))
        and: "A Harry Potter II Book"
        Book book = new Book.HarryPotterII()
        when: "A Harry Potter I Book is added"
        bookSet = bookSet.addBook(book)
        then: "price is 15.2"
        bookSet.price ==15.2D
        and: "discount is 0.05"
        bookSet.discount == 0.05D
    }

    def "Add a Harry Potter III to a BookSet which already has a Harry Potter I and II Books price is 21.6 and discount is 0.1"(){
        given: "A BookSet with a HarryPotter I and II Book"
        BookSet bookSet = new BookSet(Arrays.asList(new Book.HarryPotterI(),new Book.HarryPotterII()))
        and: "A Harry Potter III Book"
        Book book = new Book.HarryPotterIII()
        when: "A Harry Potter III Book is added"
        bookSet = bookSet.addBook(book)
        then: "price is 21.6"
        bookSet.price ==21.6D
        and: "discount is 0.1"
        bookSet.discount == 0.1D
    }

    def "Add a Harry Potter IV to a BookSet which already has a Harry Potter I, II and III Books price is 25.6 and discount is 0.2"(){
        given: "A BookSet with a HarryPotter I and II Book"
        BookSet bookSet = new BookSet(Arrays.asList(new Book.HarryPotterI(),new Book.HarryPotterII(),new Book.HarryPotterIII()))
        and: "A Harry Potter IV Book"
        Book book = new Book.HarryPotterIV()
        when: "A Harry Potter IV Book is added"
        bookSet = bookSet.addBook(book)
        then: "price is 25.6"
        bookSet.price ==25.6D
        and: "discount is 0.2"
        bookSet.discount == 0.2D
    }

    def "Add a Harry Potter V to a BookSet which already has a Harry Potter I, II, III and IV Books price is 30 and discount is 0.25"(){
        given: "A BookSet with a HarryPotter I and II Book"
        BookSet bookSet = new BookSet(Arrays.asList(new Book.HarryPotterI(),new Book.HarryPotterII(),new Book.HarryPotterIII(),new Book.HarryPotterIV()))
        and: "A Harry Potter V Book"
        Book book = new Book.HarryPotterV()
        when: "A Harry Potter V Book is added"
        bookSet = bookSet.addBook(book)
        then: "price is 30"
        bookSet.price ==30D
        and: "discount is 0.25"
        bookSet.discount == 0.25D
    }
}
