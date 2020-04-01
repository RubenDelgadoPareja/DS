package factoriaabstracta_metodofactoria;
import java.util.ArrayList;

public abstract class Carrera {
	public ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();
        
        public Carrera(ArrayList<Bicicleta> bicis_carrera){
            bicicletas = bicis_carrera;
        }
        
	public ArrayList<Bicicleta> getBicis() {
		return this.bicicletas;
	}

	public void setBicis(ArrayList<Bicicleta> aBicis) {
		this.bicicletas = aBicis;
	}
}