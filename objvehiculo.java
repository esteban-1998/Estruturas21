public class objvehiculo {
    private String marca;
    private String tipo;
    private int cilindraje;
     private int numeroCelda;
    private Double pagoActual;
    private Double pagoAnterio;
    
    public objvehiculo() {
    }

    public objvehiculo(String marca, String tipo, int cilindraje, int numeroCelda, Double pagoActual,
            Double pagoAnterio) {
        this.marca = marca;
        this.tipo = tipo;
        this.cilindraje = cilindraje;
        this.numeroCelda = numeroCelda;
        this.pagoActual = pagoActual;
        this.pagoAnterio = pagoAnterio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }

    public Double getPagoActual() {
        return pagoActual;
    }

    public void setPagoActual(Double pagoActual) {
        this.pagoActual = pagoActual;
    }

    public Double getPagoAnterio() {
        return pagoAnterio;
    }

    public void setPagoAnterio(Double pagoAnterio) {
        this.pagoAnterio = pagoAnterio;
    }
    

}
