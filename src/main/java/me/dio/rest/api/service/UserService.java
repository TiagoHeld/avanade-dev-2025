package me.dio.rest.api.service;


import me.dio.rest.api.domain.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
