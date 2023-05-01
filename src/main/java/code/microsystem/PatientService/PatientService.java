package code.microsystem.PatientService;

import java.util.List;

import code.microsystem.PatientEntity.Patient;

public interface PatientService {

	List<Patient> getAllPatients();

	Patient createPatient(Patient patient);

	

	

	Patient updatePatient(int id, Patient patient);

	static void deletePatient(int id) {
		// TODO Auto-generated method stub
		
	}



	

}
