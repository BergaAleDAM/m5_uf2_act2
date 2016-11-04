/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ALUMNEDAM
 */
public class Tontillo extends Treballador {

int horesExtra;
final int precioHoras = 20;

    public Tontillo(double salario, int horesExtra) {
        super(salario);
        this.horesExtra = horesExtra;
        
    }

    @Override
    public double getSalario() {
        return super.getSalario()+horesExtra*precioHoras;
    }

    @Override
    public void holii() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
