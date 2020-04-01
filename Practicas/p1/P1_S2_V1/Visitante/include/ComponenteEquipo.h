#include <exception>
#include <vector>
using namespace std;

#ifndef __ComponenteEquipo_h__
#define __ComponenteEquipo_h__

// #include "cliente.h"
#include "VisitanteEquipo.h"
#include "Bus.h"
#include "Disco.h"
#include "Tarjeta.h"


class ComponenteEquipo{
    private:
        string nombre;
        float precio;
    
    public:
        ComponenteEquipo();
        virtual void accept(VisitanteEquipo Visitante) = 0;
};

#endif
