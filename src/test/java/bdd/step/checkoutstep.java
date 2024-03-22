package bdd.step;
import bdd.page.Checkout;
public class checkoutstep {
    public Checkout checkout() {
        return new Checkout();
    }
    public void esperabtnCheckout() {
        checkout().espera1();
    }
    public void clickbtnCheckout() {
        checkout().btnC1();
    }

    public void innombre(String nombre) {
        checkout().inombre(nombre);
    }
    public void inape(String apellido) {
        checkout().iapellido(apellido);
    }
    public void inpostal(String codpostal) {
        checkout().ipostal(codpostal);
    }
    public void btncontinuar(){checkout().btncontinuar();}

}