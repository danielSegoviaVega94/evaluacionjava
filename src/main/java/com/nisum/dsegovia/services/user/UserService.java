package com.nisum.dsegovia.services.user;

import com.nisum.dsegovia.entity.Phone;
import com.nisum.dsegovia.entity.User;
import com.nisum.dsegovia.entity.UserInfo;
import com.nisum.dsegovia.repository.UserRepository;
import com.nisum.dsegovia.services.phone.PhoneService;
import com.nisum.dsegovia.services.userInfo.UserInfoService;
import com.nisum.dsegovia.utils.EmailUtils;
import com.nisum.dsegovia.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService implements InterfaceUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PhoneService phoneService;

    @Autowired
    UserInfoService userInfoService;

    @Override
    public User save(User user) throws Exception {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new Exception("User already exists");
        }
        if (!EmailUtils.validateEmail(user.getEmail())) {
            throw new Exception("Invalid email");
        }
        Date registerDate = new Date();
        User savedUser = userRepository.save(user);

        UserInfo ui = new UserInfo();

        ui.setCreated(registerDate);
        ui.setModified(registerDate);
        ui.setLast_login(registerDate);
        ui.setIsactive(true);
        ui.setToken(JWTUtil.getJWTToken(user.getEmail()));
        ui.setId_user_FK(user.getId_user());

        savedUser.setUserInfo(userInfoService.save(ui));

        for (Phone phone : savedUser.getPhones()) {
            User u = new User();
            u.setId_user(savedUser.getId_user());
            phone.setId_user_FK(savedUser.getId_user());
            phoneService.save(phone);
        }
        return savedUser;
    }

    @Override
    public String findByEmail(String email) throws Exception {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
