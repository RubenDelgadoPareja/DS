#include <exception>
using namespace std;

#ifndef __ComponenteEquipo_h__
#define __ComponenteEquipo_h__

// #include "cliente.h"
#include "VisitanteEquipo.h"

class ComponenteEquipo{
public:
    ComponenteEquipo();
    virtual void accept(VisitanteEquipo Visitante) = 0;
};

#endif
