package kg.itacademy.springlearning.service.impl;

import kg.itacademy.springlearning.entity.User;
import kg.itacademy.springlearning.model.UserCustom;
import kg.itacademy.springlearning.repository.UserRepository;
import kg.itacademy.springlearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //объект который отвечает за сохранения в таблицу User
    @Autowired
    private UserRepository userRepository;

    @Override
    public void createNewUser(UserCustom userCustom) {
        if (userCustom != null) {
            if (userCustom.getPassword().equals(userCustom.getRepassword())) {
                //Маппинг из userCustom в User
                User user = new User();
                user.setLogin(userCustom.getLogin());
                user.setPassword(userCustom.getPassword());
                user.setEmail(userCustom.getEmail());
                //Сохранение в бд
                user = userRepository.save(user);
                System.out.println(user);
            }
        }
    }

    @Override
    public User getUser(Integer id){
        return userRepository.findById(id).get();
    }
}
