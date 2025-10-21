class ReservaVuelo extends Reserva {
    public ReservaVuelo(String nombreCliente) {
        super(nombreCliente);
    }

    public void confirmar() {
        System.out.println("Reserva confirmada para " + nombreCliente);
    }
    

    public void seleccionarAsiento() {
        System.out.println(nombreCliente + " ha seleccionado su asiento.");
    }
}