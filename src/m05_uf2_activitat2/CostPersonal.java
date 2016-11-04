package m05_uf2_activitat2;

import java.util.ArrayList;
import java.util.Collection;

public class CostPersonal extends TreballadorNoValid {

    /**
     * A este metodo se le pasa un array de trabajadores que tienen sus datos y 
     * dependiendo si se trata de director, subdirecto o trabajadador hará una 
     * función u otra.
     * El objetivo es saber el coste total de todos los salarios teniendo en cuenta
     * las horas extra, el salario, y el tipo de trabajador que sea
     *
     * @param treballadors
     * @return
     */
    public float CostDelPersonal(Treballador treballadors[]) throws TreballadorNoValid {
        float costFinal = 0;
        Treballador treballador;

        for (int i = 0; i < treballadors.length; i++) {

            treballador = treballadors[i];
            int nomina = treballador.getNomina();
            int horesExtra = treballador.getHoresExtres();
            int tipus = treballador.getTipusTreballador();
            int preuHoraExtra = 20;

            if (treballador.getNomina() < 0 || treballador.getHoresExtres() < 0) {
                throw new TreballadorNoValid();
            }
            if (directorOSubdirector(tipus)) {
                costFinal = calculCostFinal(costFinal, nomina);
            } else if (treballador.getTipusTreballador() > 1) {
                costFinal = calculCostFinal(costFinal, nomina, horesExtra, preuHoraExtra);
            } else {
                throw new TreballadorNoValid();
            }
        }
        return costFinal;
    }

    public float calculCostFinal(float costFinal, int nomina) {
        return costFinal += nomina;
    }

    public float calculCostFinal(float costFinal, int nomina, int horesExtra, int preuHoraExtra) {
        return costFinal += nomina + (horesExtra * preuHoraExtra);
    }

    public boolean directorOSubdirector(int tipus) {
        return (tipus == Treballador.DIRECTOR || tipus == Treballador.SUBDIRECTOR);
    }
    
    
}
