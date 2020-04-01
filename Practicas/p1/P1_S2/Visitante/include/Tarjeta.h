#include <exception>
using namespace std;

#ifndef __Tarjeta_h__
#define __Tarjeta_h__

#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

class Tarjeta: ComponenteEquipo{
public:
    Tarjeta();
    void accept(VisitanteEquipo Visitante) override;
};

#endif
