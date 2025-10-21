class Reserva {
    protected String nombreCliente;

    public Reserva(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void confirmar() {
        System.out.println("Reserva confirmada para " + nombreCliente);
    }

}