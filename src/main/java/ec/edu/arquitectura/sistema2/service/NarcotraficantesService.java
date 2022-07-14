package ec.edu.arquitectura.sistema2.service;

import ec.edu.arquitectura.sistema2.dao.NarcotraficanteRespository;
import ec.edu.arquitectura.sistema2.model.Narcotraficante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class NarcotraficantesService {
    private final NarcotraficanteRespository narcotraficanteRespository;
    public Narcotraficante findByNombre(String nombre){
        return narcotraficanteRespository.findByNombreCompleto(nombre);

    }




}
