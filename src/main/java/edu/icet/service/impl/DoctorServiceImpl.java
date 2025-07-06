package edu.icet.service.impl;

import edu.icet.dto.Doctor;
import edu.icet.entity.DoctorEntity;
import edu.icet.repository.DoctorRepository;
import edu.icet.service.DoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DoctorServiceImpl implements DoctorService {

    final DoctorRepository doctorRepository;
    final ModelMapper mapper;

    @Override
    public void addDoctor(Doctor doctor) {
         doctorRepository.save(mapper.map(doctor, DoctorEntity.class));
    }

    @Override
    public List<Doctor> getAllDoctors() {
        List<Doctor> doctorList = new ArrayList<>();
        doctorRepository.findAll().forEach(e->mapper.map(doctorList,DoctorEntity.class));
        return doctorList;
    }


}
