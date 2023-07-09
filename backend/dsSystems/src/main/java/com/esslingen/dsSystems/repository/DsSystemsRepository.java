package com.esslingen.dsSystems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.esslingen.dsSystems.model.DsSystemsEntity;

@CrossOrigin(origins = "*")
public interface DsSystemsRepository extends JpaRepository<DsSystemsEntity, String> {

	Optional<DsSystemsEntity> findByBreed(String breed);

//	List<DistributedSystemsEntity> getFilteredPets(DistributedSystemsEntity dsSystemEntity);

}
