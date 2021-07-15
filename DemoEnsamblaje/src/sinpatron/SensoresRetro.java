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
public class SensoresRetro extends decorator{
    public SensoresRetro(Carro c){
        super(c);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Tiene sensores de Retro");
    }
}
