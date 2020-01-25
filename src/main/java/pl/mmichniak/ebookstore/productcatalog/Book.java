package pl.mmichniak.ebookstore.productcatalog;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Builder
@Entity
public class Book {
    @Id
    @GeneratedValue
    Long id;

    String title;
    String description;
    String coverUrl;
    Boolean isPublished;
    BigDecimal price;
}
