#include <exception>
using namespace std;

#ifndef __VisitanteEquipo_h__
#define __VisitanteEquipo_h__

#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
#include "ComponenteEquipo.h"

class VisitanteEquipo{
public:
    float precio_total;
    string info;
    
    VisitanteEquipo();
     
    virtual void visitarDisco(Disco d) = 0;
    virtual void visitarTarjeta(Tarjeta t) = 0;
    virtual void visitarBus(Bus b) = 0;
};



#endif
