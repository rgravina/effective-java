# Working through Effective Java 

I created these examples while reading Effective Java (Second Edition) by Joshua Bloch for my own learning.

## Setup

If you'd like to run the tests and look at the code, they should run as is in IntelliJ (Community Edition).

## Catalog

- Item 01: A simple service registry and provider example, similar to the book example.
- Item 02: Makes a `Color` class using a builder. You can't instantiate it any other way.
- Item 03: Class and enum variants of the Singleton pattern. There can be only one.
- Item 04: A `Utils` class which can not be instantiated. The `Color` class from Item 02 also has this trait.
- Item 05: A `Year` class which can tell you if it's before Y2K. The date for 2000 is set statically (it takes several lines, in a `static {}` block).
- Item 06: A `Zoo` class which can hold up to 16 `Animal`. The free operation nulls references to `Animal` instances to avoid memory leaks. I removed the automatically growing stack since you can appreciate the example with a fixed size stack. I did leave checks for stack overflow and underflow even though it isn't really relevant to this item but I assume the author added them in to cover some obvious error cases.