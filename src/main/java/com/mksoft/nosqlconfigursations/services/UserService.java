package com.mksoft.nosqlconfigursations.services;

import com.mksoft.nosqlconfigursations.documents.User;
import com.mksoft.nosqlconfigursations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String saveUser(User u){
        return userRepository.save(u).getUserId();
    }
}
