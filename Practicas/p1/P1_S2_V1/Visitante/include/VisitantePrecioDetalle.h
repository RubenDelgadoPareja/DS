#include <exception>
using namespace std;

#ifndef __VisitantePrecioDetalle_h__
#define __VisitantePrecioDetalle_h__

#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
#include "VisitanteEquipo.h"

class VisitantePrecioDetalle:  VisitanteEquipo{
public:
    virtual void visitarDisco(Disco d) override;
    virtual void visitarTarjeta(Tarjeta t) override;
    virtual void visitarBus(Bus b) override;
};

#endif
