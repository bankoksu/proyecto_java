package org.mvpigs.DNI;

public class tabladeAsignacion {

    char [] letras =  {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public int getModulo(){
        return this.tabla.length;
    }

    public char calculodeLetra(String dni){
        int documento = Interger.parseInt(dni);
        int posicion = documento%getModulo;
        return getLetra(posicion);
    }

    public char getLetra(int position){
        return this.tabla[posicion];
    }
}