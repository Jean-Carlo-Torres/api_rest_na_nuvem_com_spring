package dev.jean.service.impl;

import dev.jean.domain.model.User;
import dev.jean.domain.repository.UserRepository;
import dev.jean.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserServiceImpl(UserService userService,
                           UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number is already in use");
        }
        return userRepository.save(userToCreate);
    }

}

