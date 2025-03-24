package alberto.figura;

import alberto.vista.SolicitaDatos;

public abstract class Figura implements SolicitaDatos {
    public Figura()
    {
    }

    public abstract double area();
    public abstract double perimetro();
}
