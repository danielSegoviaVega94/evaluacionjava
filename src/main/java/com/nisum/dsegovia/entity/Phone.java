package com.nisum.dsegovia.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "phones")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_phone;

    Long number;
    String citycode;
    String contrycode;

    Long id_user_FK;
}
