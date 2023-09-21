package dev.jean.service;

import dev.jean.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCrete);
}
