 package factoriaabstracta_metodofactoria;
import java.util.ArrayList;

public abstract class Carrera {
	private ArrayList<Bicicleta> _bicis;
	public ArrayList<Bicicleta> _unnamed_Bicicleta_ = new ArrayList<Bicicleta>();

	public ArrayList<Bicicleta> getBicis() {
		return this._bicis;
	}

	public void setBicis(Object aBicis) {
		throw new UnsupportedOperationException();
	}

	public void setBicis(ArrayList<Bicicleta> aBicis) {
		this._bicis = aBicis;
	}
        
}