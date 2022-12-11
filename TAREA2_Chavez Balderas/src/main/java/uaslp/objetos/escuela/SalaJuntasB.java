package uaslp.objetos.escuela;

public class SalaJuntasB implements SalaDeJuntas{

    private static SalaJuntasB instance = new SalaJuntasB();
    @Override
    public String getNombre() {
        return "Sala B";
    }

    public static SalaJuntasB getInstance()
    {
        return instance;
    }
}
