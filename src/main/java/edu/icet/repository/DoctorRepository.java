package edu.icet.repository;

import edu.icet.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository <DoctorEntity,Integer>{
}
