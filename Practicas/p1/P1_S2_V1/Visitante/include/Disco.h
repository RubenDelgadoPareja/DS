#include <exception>
using namespace std;

#ifndef __Disco_h__
#define __Disco_h__

#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

class Disco: ComponenteEquipo{
private:
    string nombre="Disco";
    float precio=100;

public:
    Disco();
    string getNombre();
    float getPrecio();
    void accept(VisitanteEquipo Visitante) override;
};
#endif
