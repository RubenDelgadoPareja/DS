#include <exception>
using namespace std;

#include "Disco.h"
#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

Disco::Disco(){
    this->nombre = "Unknown";
    this->precio = 0.0;
}

string Disco::getNombre(){
    return this->nombre;
}

float Disco::getPrecio(){
    return this->precio;
}

void Disco::accept(VisitanteEquipo Visitante) {
	Visitante.visitarDisco(this);
}

