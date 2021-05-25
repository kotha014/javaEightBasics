package sujana.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101,"Java",400));
        books.add(new Book(102,"Hibernate",500));
        books.add(new Book(103,"WebService",600));
        books.add(new Book(104,"DataStructures",700));
        return books;
    }
}


