package com.nisum.dsegovia.services.userInfo;

import com.nisum.dsegovia.entity.UserInfo;
import com.nisum.dsegovia.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService implements InterfaceUserInforService {

    @Autowired
    UserInfoRepository userInfoRepository;
    @Override
    public UserInfo save(UserInfo ui) {
        return userInfoRepository.save(ui);
    }
}
