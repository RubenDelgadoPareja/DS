#include <exception>
using namespace std;

#ifndef __VisitantePrecio_h__
#define __VisitantePrecio_h__

#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
#include "VisitanteEquipo.h"


class VisitantePrecio:  VisitanteEquipo{
public:
    virtual void visitarDisco(Disco d) override;
    virtual void visitarTarjeta(Tarjeta t) override;
    virtual void visitarBus(Bus b) override;
};


#endif
