package com.hexagonal.domain.query;

import javax.persistence.Id;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "jw_order")
public class QueryOrder {

  @Id
  private Long id;
  private String name;
  private String mobile;

  protected QueryOrder() {}
}
