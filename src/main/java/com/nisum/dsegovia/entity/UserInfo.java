package com.nisum.dsegovia.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "users_info")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserInfo {

    @Id
    private Long id_user_FK;
    private Date created;
    private Date modified;
    private Date last_login;
    private String token;
    private boolean isactive;

}
