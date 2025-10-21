class ReservaHote extends Reserva {
    public ReservaHote(String nombreCliente) {
        super(nombreCliente);
    }

    public void confirmar() {
        System.out.println("Reserva confirmada para " + nombreCliente);
    }

    public void elegirHabitacion() {
        System.out.println(nombreCliente + " ha elegido su habitación.");
    }
}