package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura,DrawableItem{
    private double lado;
    private int numeroDeLados;
    private double area;
    private String name = "Poligono Regular";

    public PoligonoRegular(int numeroDeLados,double lado)
    {
        if(numeroDeLados<5)
        {
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }

        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public PoligonoRegular(int numeroDeLados)
    {
        if(numeroDeLados<5)
        {
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }

        this.numeroDeLados=numeroDeLados;
    }

    public void setLado(double lado)
    {
        this.lado=lado;
    }

    public double getLado()
    {
        return lado;
    }

    public double getArea()
    {
        if(numeroDeLados<5)
        {
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }

        double angulo = 360/(float)numeroDeLados;
        double apotema = lado / (2*Math.tan(Math.toRadians(angulo/2)));

        area = ((numeroDeLados*lado) * apotema) / 2;

        return area;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
