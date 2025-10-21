public class ReservaViaje {
    public static void main(String[] args) {

        ReservaVuelo vuelo = new ReservaVuelo("Kevin Marin");
        vuelo.confirmar();
        vuelo.seleccionarAsiento();

        ReservaHote hotel = new ReservaHote("Jhon Cano");
        hotel.confirmar();
        hotel.elegirHabitacion();
    }
}
