package pl.mmichniak.ebookstore.productcatalog;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;

@AllArgsConstructor
@Getter
@Builder
public class Book {
    String title;
    String description;
    String coverUrl;
    Boolean isPublished;
    BigDecimal price;
}
