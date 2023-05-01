package code.microsystem.PatientControler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.microsystem.PatientEntity.Patient;
import code.microsystem.PatientService.PatientService;

@RestController
@RequestMapping("/api/patients")

public class PatientController {
	@Autowired
	
	private PatientService patientService;
	@GetMapping("/getAllPatients")
	public List<Patient>getAllPatients(){
		return patientService.getAllPatients();
		
	}
	@PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
	}
	@PutMapping("/{id}")
    public Patient updatePatient(@PathVariable int id, @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }
	 @DeleteMapping("/{id}" )
     public void deletePatient(@PathVariable int id) {
   	  PatientService.deletePatient(id);
     }
     
	}
