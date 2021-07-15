/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import sinpatron.Carroceria;
import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;



/**
 *
 * @author 59396
 */
public abstract class VehiculoBuilder {
    private Vehiculo vehiculo;
    
    
    public void setColor (String color){        
    }
    public void setDireccionAsistida(boolean direccionAsistida){
    }
    public void setMarca(String marca){
    }
    public void setModelo(String modelo){        
    }
    public void setMotor(MotorDiesel motor){     
    }
    public void setCarroceria(Carroceria carroceria){        
    }
}
