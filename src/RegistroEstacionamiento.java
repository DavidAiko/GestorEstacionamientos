class RegistroEstacionamiento implements Registrable {

    @Override
    public void registrarVehiculo(String placa) {
        System.out.println("Vehículo con placa " + placa + " registrado exitosamente.");
    }
}
