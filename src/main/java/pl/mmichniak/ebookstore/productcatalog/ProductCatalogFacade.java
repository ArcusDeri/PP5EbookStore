package pl.mmichniak.ebookstore.productcatalog;

import java.util.List;

public class ProductCatalogFacade {
    private final BookRepository repository;

    public ProductCatalogFacade(BookRepository bookRepository) {
        this.repository = bookRepository;
    }

    public void addBook(Book book) {
        repository.save(book);
    }

    public List<Book> allBooks() {
        return repository.findAll();
    }
}
