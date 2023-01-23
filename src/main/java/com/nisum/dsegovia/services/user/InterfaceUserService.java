package com.nisum.dsegovia.services.user;

import com.nisum.dsegovia.entity.User;

import java.util.List;

public interface InterfaceUserService {

    public User save(User user) throws Exception;

    public String findByEmail(String email) throws Exception;

    public List<User> findAll();
}
