#include <exception>
using namespace std;

#include "Bus.h"
#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"


void Bus::accept(VisitanteEquipo Visitante) {
    Visitante.visitarBus(this);
}

