package ec.edu.arquitectura.sistema2.dao;

import ec.edu.arquitectura.sistema2.model.Narcotraficante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NarcotraficanteRespository extends MongoRepository<Narcotraficante,String> {

    Narcotraficante findByNombreCompleto(String nombreCompleto);
}
