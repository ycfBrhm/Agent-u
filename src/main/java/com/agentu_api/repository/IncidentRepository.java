package com.agentu_api.repository;

import com.agentu_api.bo.Etudiant;
import com.agentu_api.bo.Incident;
import org.springframework.data.repository.CrudRepository;

public interface IncidentRepository extends CrudRepository<Incident, String> {

}
