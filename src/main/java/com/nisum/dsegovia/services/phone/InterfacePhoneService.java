package com.nisum.dsegovia.services.phone;

import com.nisum.dsegovia.entity.Phone;

import java.util.List;

public interface InterfacePhoneService {

    List<Phone> saveAll(List<Phone> phones);

    Phone save(Phone phone);
}
