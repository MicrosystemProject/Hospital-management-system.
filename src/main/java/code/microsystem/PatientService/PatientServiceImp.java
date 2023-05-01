package code.microsystem.PatientService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.microsystem.PatientEntity.Patient;
import code.microsystem.PatientReporcetry.PatientReporsitry;

@Service
public class PatientServiceImp implements PatientService{
    @Autowired
    private PatientReporsitry patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

	@Override
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}



	@Override
	public Patient updatePatient(int id, Patient patient) {
		Optional<Patient> existingPatient = patientRepository.findById((long) id);
        if (existingPatient.isPresent()) {
        Patient updatedPatient = existingPatient.get();
        updatedPatient.setName(patient.getName());
        updatedPatient.setGender(patient.getGender());
        
        updatedPatient.setPhone(patient.getPhone());
        return patientRepository.save(updatedPatient);
    } else {
        throw new RuntimeException("Patient not found");
    }
	}
	public void deletePatient(int id) {
        Optional<Patient> patient = patientRepository.findById((long) id);
        if (patient.isPresent()) {
            patientRepository.delete(patient.get());
        } else {
            throw new RuntimeException("Patient not found");
        }
    }
	
	}

   

