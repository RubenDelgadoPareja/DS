#include <exception>
using namespace std;

#ifndef __Bus_h__
#define __Bus_h__

#include <string>
#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"


class Bus: ComponenteEquipo{
private:
    string nombre="Bus";
    float precio=10;
    
public:
    Bus();
    string getNombre();
    float getPrecio();
    void accept(VisitanteEquipo Visitante) override;
};

#endif
