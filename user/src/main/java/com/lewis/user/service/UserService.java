package com.lewis.user.service;


import com.lewis.user.models.User;
import com.lewis.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll()
    {
        List<User> user =  userRepository.findAll();
        return user;
    }

    public Optional<User> getById(Integer id)
    {
        try
        {
            Optional<User> user = userRepository.findById(id);
            return user;
        }
        catch (Exception e )
        {
            throw new RuntimeException();
        }


    }
}
