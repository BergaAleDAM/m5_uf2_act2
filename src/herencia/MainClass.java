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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Treballador[] tolais = new Treballador[3];
        CostPersonal cp = new CostPersonal();
        tolais[0] = new Tontillo(1000, 2);
        tolais[1] = new Director(1600);
        tolais[2] = new Subdirector(2000);
        
        System.out.println(cp.calcularCostTreballadors(tolais));
        
    }

}
