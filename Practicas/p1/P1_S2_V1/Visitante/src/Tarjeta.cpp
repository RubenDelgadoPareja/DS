#include <exception>
using namespace std;

#include "Tarjeta.h"
#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

Tarjeta::Tarjeta(){
    this->nombre = "Unknown";
    this->precio = 0.0;
}

void Tarjeta::accept(VisitanteEquipo Visitante) {
    Visitante.visitarTarjeta(this);
}

