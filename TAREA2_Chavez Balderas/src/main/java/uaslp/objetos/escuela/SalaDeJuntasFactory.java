package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {

    public SalaDeJuntasFactory()
    {

    }

    public static SalaDeJuntas get(String nombreSala)
    {
        return switch (nombreSala) {
            case "Sala A" -> SalaJuntasA.getInstance();
            case "Sala B" -> SalaJuntasB.getInstance();
            case "Sala C" -> SalaJuntasC.getInstance();
            default -> null;
        };

    }
}
