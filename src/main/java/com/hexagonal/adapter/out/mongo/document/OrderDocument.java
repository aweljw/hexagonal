package com.hexagonal.adapter.out.mongo.document;

import javax.persistence.Id;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "jw_order")
public class OrderDocument {

  @Id
  private Long id;
  private String name;
  private String mobile;

  protected OrderDocument() {}
}
