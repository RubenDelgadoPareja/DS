package factoriaabstracta_metodofactoria;
import java.util.ArrayList;

public class FactoriaMontana extends FactoriaCarrera_Bicicleta {
        private ArrayList<Bicicleta> bicis_carrera = new ArrayList<Bicicleta>();
        private CarreraMontana carrera = new CarreraMontana(bicis_carrera);
        
	public void crearCarrera() {
            int num_bicis = bicis_carrera.size();
            num_bicis = num_bicis - (int)(num_bicis*0.2);
            CarreraMontana cm = new CarreraMontana(bicis_carrera);
            carrera = cm;
	}

	public void crearBicicleta() {
            Bicicleta b = new BicicletaMontana();
            bicis_carrera.add(b);
	}
}