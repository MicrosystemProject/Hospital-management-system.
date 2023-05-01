package code.microsystem.PatientEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Patient")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	 @Column(nullable = false)
    private String name;
	 @Column(nullable = false)
    private String email;
	 @Column(nullable = false)
    private String phone;
	 @Column (nullable =false)
	 private String gender;
	 @Column (nullable = false)
	 private int age;
	

}
