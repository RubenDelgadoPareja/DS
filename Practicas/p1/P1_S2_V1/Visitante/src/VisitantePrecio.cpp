#include <exception>
using namespace std;

#include "VisitantePrecio.h"
#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
#include "VisitanteEquipo.h"

void VisitantePrecio::visitarDisco(Disco D) {
    precio_total += D.getPrecio();
}

void VisitantePrecio::visitarTarjeta(Tarjeta T) {
    precio_total += T.getPrecio();
}

void VisitantePrecio::visitarBus(Bus B) {
    precio_total += B.getPrecio();
}

