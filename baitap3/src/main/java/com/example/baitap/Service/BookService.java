package com.example.baitap.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.baitap.Model.Book;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();
    private Long nextId = 1L;

    // Lấy tất cả sách
    public List<Book> getAllBooks() {
        return books;
    }

    // Thêm sách (tự tăng ID)
    public void addBook(Book book) {
        book.setId(nextId++);
        books.add(book);
    }

    // Lấy sách theo ID
    public Optional<Book> getBookById(Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    // Cập nhật sách
    public void updateBook(Long id, Book updatedBook) {
        books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .ifPresent(book -> {
                    book.setTitle(updatedBook.getTitle());
                    book.setAuthor(updatedBook.getAuthor());
                });
    }

    // Xóa sách
    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}
