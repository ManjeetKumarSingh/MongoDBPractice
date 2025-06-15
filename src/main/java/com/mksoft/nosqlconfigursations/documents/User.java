package com.mksoft.nosqlconfigursations.documents;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.aot.generate.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    private String userId;
    private String userName;
    private String userEmail;

}
