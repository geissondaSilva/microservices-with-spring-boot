package br.com.geisson.sales.account.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String name;

    private String lastName;

    private String email;
}
