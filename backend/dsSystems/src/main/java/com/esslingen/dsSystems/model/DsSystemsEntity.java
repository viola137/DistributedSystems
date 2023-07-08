package com.esslingen.dsSystems.model;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pets")
public class DsSystemsEntity {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id", updatable = false, nullable = false, unique = true)
	private String id;
	
	private String animal;
	private String breed;
	private String characteristics;
	private String issues;
	private String coats;
	private Float size;
	private Boolean long_fur;
	private Boolean loud;
	private Boolean introverted;
	private Boolean intelligent;
	
}
