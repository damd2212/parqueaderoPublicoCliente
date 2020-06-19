/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopcliente.negocio;

import co.unicauca.parqueaderospopcliente.acceso.IParqueadero;
import co.unicauca.parqueaderospopcliente.acceso.ParqueaderoServicioImplSockets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danny
 */
public class GestorEstadistica {
    private final IParqueadero parqueadero;
    
    public GestorEstadistica(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    
    public GestorEstadistica(IParqueadero i){
        parqueadero = i;
    }
    
    public List<EstadisticaIngreso> consultarEstadistica(String Fecha)throws Exception{
        return parqueadero.consultarEstadistica(Fecha);
    }
}
