package com.ikari.katas.harrypotter

import com.ikari.katas.harrypotter.entities.Book

class BookStore(private val books: List<Book> = listOf()) {

    val price = calculateBasePrice() * calculateDiscount()

    fun addBook(book: Book) = BookStore(books.plus(book))


    private fun calculateBasePrice() = books.size * 8.0

    private fun calculateDiscount(): Double {
        val hp1 = mutableListOf<Book>()
        val hp2 = mutableListOf<Book>()
        val hp3 = mutableListOf<Book>()
        val hp4 = mutableListOf<Book>()
        val hp5 = mutableListOf<Book>()
        var discount = 0.0

        for (b in books) {
            if (b is Book.HarryPotterI) {
                hp1.add(b)
            } else if (b is Book.HarryPotterII) {
                hp2.add(b)
            } else if (b is Book.HarryPotterIII) {
                hp3.add(b)
            } else if (b is Book.HarryPotterIV) {
                hp4.add(b)
            } else if (b is Book.HarryPotterV) {
                hp5.add(b)
            }
        }
        if ((hp1.size == hp2.size) && (hp1.size == hp3.size) && (hp1.size == hp4.size) && (hp1.size == hp5.size))
            discount = 0.25
        else if (hp1.size != 0) {
            if (hp2.size != 0) {
                if (hp3.size != 0) {
                    if (hp4.size != 0) {
                        discount = 0.2
                    } else if (hp5.size != 0) {
                        discount = 0.2
                    } else {
                        discount = 0.1
                    }
                } else {
                    if (hp4.size != 0) {
                        if (hp5.size != 0) {
                            discount = 0.2
                        } else {
                            discount = 0.1
                        }
                    } else if(hp5.size!=0) {
                        discount = 0.1
                    }else{
                        discount = 0.05
                    }
                }
            } else if (hp3.size != 0) {
                if (hp4.size != 0) {
                    if (hp5.size != 0) {
                        discount = 0.2
                    } else {
                        discount = 0.1
                    }
                } else if (hp5.size != 0) {
                    discount = 0.1
                } else {
                    discount = 0.05
                }
            } else if (hp4.size != 0) {
                if(hp5.size!=0){
                    discount = 0.1
                }else {
                    discount = 0.05
                }
            } else if (hp5.size != 0) {
                discount = 0.05
            }

        } else if (hp2.size != 0) {
            if (hp3.size != 0) {
                if (hp4.size != 0) {
                    if(hp5.size!=0){
                        discount = 0.2
                    }else {
                        discount = 0.1
                    }
                } else if (hp5.size != 0) {
                    discount = 0.1
                } else {
                    discount = 0.05
                }
            } else if (hp4.size != 0) {
                if (hp5.size != 0) {
                    discount = 0.1
                } else {
                    discount = 0.05
                }
            } else if (hp5.size != 0) {
                discount = 0.05
            }

        } else if (hp3.size != 0) {
            if (hp4.size != 0) {
                if (hp5.size != 0) {
                    discount = 0.1
                } else {
                    discount = 0.05
                }
            } else if (hp5.size != 0) {
                discount = 0.05
            }
        } else if (hp4.size != 0) {
            if (hp5.size != 0) {
                discount = 0.05
            }
        }
        return 1.0 - discount
    }

}