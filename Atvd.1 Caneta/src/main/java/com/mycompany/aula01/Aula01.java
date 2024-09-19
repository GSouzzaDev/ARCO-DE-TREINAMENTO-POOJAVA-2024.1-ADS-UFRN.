package com.mycompany.aula01;
public class Aula01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setCarga(50);
        c1.setCor("Azul");
        c1.setModelo("Bic");
        c1.setPonta(1.0f);
        
        c1.Tampar();
        
        c1.Escrever();
        c1.status();
    }
    
}
