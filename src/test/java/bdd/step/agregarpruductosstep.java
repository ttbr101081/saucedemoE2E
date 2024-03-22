package bdd.step;
import bdd.page.AgProducto;

public class agregarpruductosstep {
    public AgProducto agProducto() {
        return new AgProducto();
    }
    public void agregarproducto1step(){agProducto().agregarproducto1();}
    public void esperaproducto1step(){agProducto().esperaproducto1();}
    public void agregarproducto2step(){agProducto().agregarproducto2();}
}