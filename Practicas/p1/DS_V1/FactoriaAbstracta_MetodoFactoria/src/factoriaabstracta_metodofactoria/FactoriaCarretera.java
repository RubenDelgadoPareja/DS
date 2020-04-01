package factoriaabstracta_metodofactoria;

import java.lang.Math;
import java.util.ArrayList;

public class FactoriaCarretera extends FactoriaCarrera_Bicicleta {
        private ArrayList<Bicicleta> bicis_carrera = new ArrayList<Bicicleta>();
        private CarreraCarretera carrera = new CarreraCarretera(bicis_carrera);
        
	public void crearCarrera() {
            int num_bicis = bicis_carrera.size();
            num_bicis = num_bicis - (int)(num_bicis*0.1);
            CarreraCarretera cm = new CarreraCarretera(bicis_carrera);
            carrera = cm;
	}

	public void crearBicicleta() {
            Bicicleta b = new BicicletaCarretera();
            bicis_carrera.add(b);
	}
}