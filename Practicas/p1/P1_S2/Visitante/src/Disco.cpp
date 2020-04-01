#include <exception>
using namespace std;

#include "Disco.h"
#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

void Disco::accept(VisitanteEquipo Visitante) {
	Visitante.visitarDisco(this);
}

