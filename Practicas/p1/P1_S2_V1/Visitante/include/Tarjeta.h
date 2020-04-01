#include <exception>
using namespace std;

#ifndef __Tarjeta_h__
#define __Tarjeta_h__

#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

class Tarjeta: ComponenteEquipo{
private:
    string nombre="Tarjeta";
    float precio=50;    
    
public:
    Tarjeta();
    string getNombre();
    float getPrecio();
    void accept(VisitanteEquipo Visitante) override;
};

#endif
