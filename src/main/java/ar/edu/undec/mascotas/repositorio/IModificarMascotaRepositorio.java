package ar.edu.undec.mascotas.repositorio;

import ar.edu.undec.mascotas.doamain.Mascota;

public interface IModificarMascotaRepositorio {
    boolean update(Mascota laMascota);
}