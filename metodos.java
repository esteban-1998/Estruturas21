import java.util.Scanner;
public class metodos {
    Scanner sc = new Scanner(System.in);
    public objvehiculo[] LlenarRegistro(objvehiculo[] r) {
        for (int i = 0; i< r.length; i++){
        objvehiculo o = new objvehiculo();
        System.out.println("ingrese marca:");
        o.setMarca(sc.next());
        System.out.println("ingrese tipo de vehiculo:");
        o.setTipo(sc.next());
        System.out.println("ingrese cilindraje:");
        o.setCilindraje(sc.nextInt());
        System.out.println("ingrese marca:");
        o.setMarca(sc.next());
        if (o.getCilindraje() > 900 && o.getCilindraje() < 1700){
            o.setPagoAnterio(150.000);

        }
        else if (o.getCilindraje() >= 1700 && o.getCilindraje() < 2000){
            o.setPagoAnterio(200.000);

        
        }
        else {
            o.setPagoAnterio(250.000);
        }
        o.setNumeroCelda(i + 1);
        r[i] = o;
        }
        return r;
     }
     public objvehiculo[] calcularN(objvehiculo[]r) {
        for (int i = 0; i < r.length; i++){
            r[i].setPagoAnterio(r[i].getPagoAnterio()*1.23);
        }
        return r;

     }
    public void MostrarR(objvehiculo[]r){
        for (int i = 0; i < r.length; i++){
            System.out.println("marca:"+r[i].getMarca());
             System.out.println("tipo de vehiculo:"+r[i].getTipo());
              System.out.println("cilindraje:"+r[i].getCilindraje());
               System.out.println("pango ant:"+r[i].getPagoAnterio());
                System.out.println("pago act:"+r[i].getPagoActual());
                 System.out.println("numero de celda:"+r[i].getNumeroCelda());
        }
    }
    

}
