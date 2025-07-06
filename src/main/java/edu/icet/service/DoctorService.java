package edu.icet.service;

import edu.icet.dto.Doctor;
import edu.icet.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.util.List;

public interface DoctorService  {
    void addDoctor( Doctor doctor);
    List<Doctor> getAllDoctors();
}
