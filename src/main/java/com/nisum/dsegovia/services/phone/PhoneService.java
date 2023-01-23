package com.nisum.dsegovia.services.phone;

import com.nisum.dsegovia.entity.Phone;
import com.nisum.dsegovia.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneService implements InterfacePhoneService {
    @Autowired
    PhoneRepository phoneRepository;
    @Override
    public List<Phone> saveAll(List<Phone> phones) {
        return phoneRepository.saveAll(phones);
    }

    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }
}
