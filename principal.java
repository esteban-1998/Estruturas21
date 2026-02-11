import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int n = 0;
        System.out.println("ingrese la dimension del patio");
        n = sc.nextInt();
        objvehiculo[] r = new objvehiculo[n];
        r = m.LlenarRegistro(r);
        r = m.calcularN(r);
        m.MostrarR(r);

        
    }
}
 