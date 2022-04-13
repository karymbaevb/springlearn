package kg.itacademy.springlearning.service;

import kg.itacademy.springlearning.entity.User;
import kg.itacademy.springlearning.model.UserCustom;

public interface UserService {
    void createNewUser(UserCustom userCustom);
    User getUser(Integer id);
}
