package ch0

import groovy.transform.Immutable

class Book {
    String title
}

@Immutable class FixedBook {
    String title
}