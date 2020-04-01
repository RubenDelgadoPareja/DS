#include <exception>
using namespace std;

#ifndef __Disco_h__
#define __Disco_h__

#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

class Disco: ComponenteEquipo{
public:
    Disco();
    void accept(VisitanteEquipo Visitante) override;
};
#endif
