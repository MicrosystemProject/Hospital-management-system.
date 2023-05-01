package code.microsystem.PatientReporcetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.microsystem.PatientEntity.Patient;

@Repository
public interface PatientReporsitry extends JpaRepository<Patient, Long> {

}
