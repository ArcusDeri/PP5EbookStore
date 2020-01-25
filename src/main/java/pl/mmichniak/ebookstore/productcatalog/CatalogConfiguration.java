package pl.mmichniak.ebookstore.productcatalog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class CatalogConfiguration {

    @Bean
    ProductCatalogFacade facade(BookRepository repository) {
        ProductCatalogFacade facade = new ProductCatalogFacade(repository);
        facade.addBook(thereIsPublishedBook("Lord of the rings"));
        facade.addBook(thereIsPublishedBook("Hobbit"));

        return facade;
    }

    private Book thereIsPublishedBook(String title){
        return Book.builder()
                .title(title)
                .description(title)
                .coverUrl("http://cover.dev")
                .price(BigDecimal.valueOf(120))
                .isPublished(true)
                .build();
    }
}
