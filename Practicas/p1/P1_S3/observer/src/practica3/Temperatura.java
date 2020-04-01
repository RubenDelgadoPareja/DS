/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author agus
 */
public class Temperatura {
    private float _temperatura;
    private final ArrayList<Observer> observadores = new ArrayList<>();
        
    public void addObserver(Observer ob){
        this.observadores.add(ob);
    }
        
    public void removeObserver(Observer ob){
        this.observadores.remove(ob);
    }
        
    public void setTemp(float temp){
        this._temperatura = temp;
        for (Observer ob : this.observadores){
            ob.update(null,this._temperatura);
            //Aquí hay que poner ob.update(this._temperatura/temp), pero suda polla el puto netbeans
        }
    }
    
    
}
