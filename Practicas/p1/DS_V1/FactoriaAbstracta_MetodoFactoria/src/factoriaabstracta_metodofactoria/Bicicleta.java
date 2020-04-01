/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriaabstracta_metodofactoria;

/**
 *
 * @author agus
 */
public abstract class Bicicleta {
    private int IdBicicleta;
    public static int n_bici = 0;
    
    public Bicicleta(){
        this.IdBicicleta = n_bici;
        this.n_bici++;
    }
}
