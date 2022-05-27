package EstanciaPersistencia;

import EstanciaEntidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

public class DaoFamilias extends DAO {

    public Collection<Familia> listarFamiliasNumHijosMenorTresYEdadMaxMayorDiez() throws Exception {
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos <= 3 and edad_maxima<10";
            consultarBase(sql);
            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
                familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Familia> listarFamiliasMailHotmail() throws Exception {
        try {
            String sql = "SELECT * FROM familias where email like '%hotmail%' ";
            consultarBase(sql);
            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
                familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
