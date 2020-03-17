package com.example.class6_librar_app_2.model;


import java.util.ArrayList;
import java.util.List;

public class BooksDataAccess {
    private List<Book> books = new ArrayList<Book>();
    public BooksDataAccess(){
        books.add(new Book("Thinking in Java","An author",345));
        books.add(new Book("C# for dummies","Davvviidd",5543));
        books.add(new Book("Cool Book for php","adawd",653));
    }
    public String getBookByLang (String Lang){
        String res="";
        for(Book b:books){
            if(b.getTitle().contains(Lang)){
                res+=b.getTitle()+"\n";
            }
        }
        return res;
    }
}
