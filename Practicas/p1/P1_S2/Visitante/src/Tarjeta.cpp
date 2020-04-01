#include <exception>
using namespace std;

#include "Tarjeta.h"
#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

void Tarjeta::accept(VisitanteEquipo Visitante) {
    Visitante.visitarTarjeta(this);
}

