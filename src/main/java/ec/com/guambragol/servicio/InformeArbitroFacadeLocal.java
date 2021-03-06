/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.InformeArbitro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface InformeArbitroFacadeLocal {

    void create(InformeArbitro informeArbitro);

    void edit(InformeArbitro informeArbitro);

    void remove(InformeArbitro informeArbitro);

    InformeArbitro find(Object id);

    List<InformeArbitro> findAll();

    List<InformeArbitro> findRange(int[] range);

    int count();
    
}
