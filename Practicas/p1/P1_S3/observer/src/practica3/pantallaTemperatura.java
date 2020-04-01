package practica3;
import java.util.Observer;
import java.util.Observable;

public class pantallaTemperatura implements Observer {
	private float _temp_pantalla;
	public Temperatura _pantalla;                                                                                                                              
      
        @Override
        public void update(Observable o, Object temp){
            this._temp_pantalla = (float) temp;
        }
        
        public float getTemp(){
            return this._temp_pantalla;
        }
        
        public void pedirTemp(Observable o){
            this._temp_pantalla = ((Simulador) o).getTemp();
        }
}