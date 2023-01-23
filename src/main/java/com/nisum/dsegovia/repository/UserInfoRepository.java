package com.nisum.dsegovia.repository;


import com.nisum.dsegovia.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {


}
