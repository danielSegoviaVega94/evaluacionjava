package com.nisum.dsegovia.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = -6436937740633686011L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "id_user", nullable = false, insertable = false)
    private long id_user;
    String name;
    String email;
    String password;

    @OneToMany(mappedBy = "id_user_FK", cascade = CascadeType.ALL)
    List<Phone> phones;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_info", referencedColumnName = "id_user_FK")
    UserInfo userInfo;
}
