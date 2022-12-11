package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo {

    private String name = "Triangulo Escaleno";
    private String description = "Lados diferentes";
    public TrianguloEscaleno()
    {

    }
    public String getDescription()
    {
        return description;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
