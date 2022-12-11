package uaslp.objetos.escuela;

public class SalaJuntasC implements SalaDeJuntas{

    private static SalaJuntasC instance = new SalaJuntasC();
    @Override
    public String getNombre() {
        return "Sala C";
    }

    public static SalaJuntasC getInstance()
    {
        return instance;
    }
}
