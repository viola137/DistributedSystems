package com.esslingen.dsSystems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esslingen.dsSystems.model.DsSystemsEntity;

public interface DsSystemsRepository extends JpaRepository<DsSystemsEntity, String> {

	Optional<DsSystemsEntity> findByBreed(String breed);

//	List<DistributedSystemsEntity> getFilteredPets(DistributedSystemsEntity dsSystemEntity);

}
