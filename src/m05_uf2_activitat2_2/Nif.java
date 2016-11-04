package m05_uf2_activitat2_2;


public class Nif {
    
    private String nif;
    private String missatge;
    private char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    /**
     * El metodo es valid dicta si un DNI es vàlido comparando el tamaño de la
     * cadena y la letra.
     */
    public void esValid() {

        
        int num = 0;
        String letra;
        String numero;

        letra = nif.substring(nif.length() - 1);
        numero = nif.substring(0, nif.length() - 1);


        if (longitud(nif.length())) {
            missatge = "Format Incorrecte";
        }
         else {
            try {
                num = Integer.parseInt(numero);

                if (comprobarLetraDni(num, letra)) {
                    missatge =  "Nif Vàlid";
                } else {
                    missatge = "Nif Invàlid";
                }

            } catch (NumberFormatException e) {
                missatge = "Format Incorrecte";
            }
    
        }
    }
    /**
     * Este metodo recibe el NIF por parámetro y este devuelve un boolean para
     * saber si la ongitud es correcta.
     * @param nif
     * @return 
     */
    public boolean longitud(int nif){
        int longitudCadena1=8;
        int longitudCadena2=9;
        return (nif < longitudCadena1 || nif > longitudCadena2);
    }
    
    /**
     * Devuelve el valor del la posicion de la letra de lista que se calculará 
     * con el modulo entre num y el tamanaño de la lsita.
     * Si coincide la letra con la posición será valido.
     * @param num
     * @param letra
     * @return 
     */
    public boolean comprobarLetraDni (int num, String letra){
        
        return (String.valueOf(llista[num % llista.length]).equals(letra));
    }

}