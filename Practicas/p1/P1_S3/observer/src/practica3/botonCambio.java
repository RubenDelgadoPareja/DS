package practica3;
import practica3.Temperatura;
import java.util.Observer;
import java.util.Observable;

public class botonCambio implements Observer {
	private float _temp_boton;
        
        @Override
        public void update(Observable o, Object temp){
            this._temp_boton = (float) temp;
        }
        
        /*public void setTemp(float temp){
            this._temp_boton = temp;
        }*/
        
        public float getTemp(){
            return this._temp_boton;
        }
        
        
}