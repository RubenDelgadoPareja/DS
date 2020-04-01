package practica3;

import java.util.Observer;
import java.util.Observable;

public class graficaTemperatura implements Observer {
	private float _temp_grafica;
	
        
        @Override
        public void update(Observable o, Object temp){
            this._temp_grafica = (float) temp;
        }
        
        public float getTemp(){
            return this._temp_grafica;
        }
}