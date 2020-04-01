#include <exception>
using namespace std;

#include "Bus.h"
#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

Bus::Bus(){
    this->nombre = "Unknown";
    this->precio = 0.0; 
}

void Bus::accept(VisitanteEquipo Visitante) {
    Visitante.visitarBus(this);
}

string Bus::getNombre(){
    return this->nombre;
}

float Bus::getPrecio(){
    return this->getPrecio();
}
