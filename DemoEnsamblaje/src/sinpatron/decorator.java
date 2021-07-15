/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinpatron;

/**
 *
 * @author Joao
 */
public abstract class decorator implements Carro{
    protected Carro car;
    public decorator(Carro c){
        this.car=c;
    }
    @Override
    public void assemble(){
        this.car.assemble();
    }
}
