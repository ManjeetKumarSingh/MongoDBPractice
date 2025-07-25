package com.mksoft.nosqlconfigursations.repository;

import com.mksoft.nosqlconfigursations.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User, String> {
}
