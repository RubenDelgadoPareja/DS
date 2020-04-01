#include <exception>
using namespace std;

#include "VisitantePrecioDetalle.h"
#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
#include "VisitanteEquipo.h"

void VisitantePrecioDetalle::visitarDisco(Disco D) {
    info += "Componente: " + D.getNombre() + ". Precio: " + D.getPrecio() + " €.\n"; 
}

void VisitantePrecioDetalle::visitarTarjeta(Tarjeta T) {
    info += "Componente: " + T.getNombre() + ". Precio: " + T.getPrecio() + " €.\n"; 
}

void VisitantePrecioDetalle::visitarBus(Bus B) {
    info += "Componente: " + B.getNombre() + ". Precio: " + B.getPrecio() + " €.\n"; 
}

