abstract class Estacionamiento {
    protected String nombre;
    protected int capacidad;

    public Estacionamiento(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    abstract double calcularTarifa(int horas);

    public void mostrarInfo() {
        System.out.println("Estacionamiento: " + nombre);
        System.out.println("Capacidad: " + capacidad + " vehículos");
    }
}

class EstacionamientoAireLibre extends Estacionamiento {
    public EstacionamientoAireLibre(String nombre, int capacidad) {
        super(nombre, capacidad);
    }

    @Override
    double calcularTarifa(int horas) {
        return horas * 2000;
    }
}

class EstacionamientoSubterraneo extends Estacionamiento {
    public EstacionamientoSubterraneo(String nombre, int capacidad) {
        super(nombre, capacidad);
    }

    @Override
    double calcularTarifa(int horas) {
        return horas * 3500;
    }
}
