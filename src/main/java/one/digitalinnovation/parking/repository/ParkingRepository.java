package one.digitalinnovation.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.parking.model.Parking;

@Repository																		/*Associada com classes que isolam o acesso aos dados da sua aplicação.*/
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
