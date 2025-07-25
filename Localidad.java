public class Localidad {
    public int localidad;
    public int espacio;
    public String persona;

    public Localidad(int localidad, int espacio) {
        this.localidad = localidad;
        this.espacio = espacio;
    }

    public int getEspacio() {
        return espacio;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void ingresarPersona(String persona) {
        this.persona = persona;
        if (espacio > 0) {
            espacio = espacio - 1;
        }
    }
}
