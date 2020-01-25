package pl.mmichniak.ebookstore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.mmichniak.ebookstore.productcatalog.Book;
import pl.mmichniak.ebookstore.productcatalog.BookRepository;
import pl.mmichniak.ebookstore.productcatalog.ProductCatalogFacade;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCatalogFacadeTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void itAllowAddBookToCatalog() {
        ProductCatalogFacade api = new ProductCatalogFacade(bookRepository);

        Book book = thereIsBookIWouldLikeToHave();
        api.addBook(book);

        List<Book> books = api.allBooks();
        assertThat(books).hasSize(1);
    }

    private Book thereIsBookIWouldLikeToHave() {
        return Book.builder()
                .coverUrl("https://picsum.photos/seed/picsum/200/300")
                .title("pragmatic programmer")
                .isPublished(true)
                .price(BigDecimal.valueOf(120))
                .description("Fine book")
                .build();
    }
}
