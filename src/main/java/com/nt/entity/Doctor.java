package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@RequiredArgsConstructor
public class Doctor {
	@Id
	@SequenceGenerator(name="gen1", sequenceName ="d-seq", initialValue =100, allocationSize =1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Integer Did;
	@NonNull
	private String dname;
	@NonNull
	private String spl;
	@NonNull
	private Double sal;

}
