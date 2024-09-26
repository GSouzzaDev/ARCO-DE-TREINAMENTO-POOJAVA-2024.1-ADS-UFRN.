package com.mycompany.aula01;
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

/*--------------Constructor----------------*/
    public Caneta() {
        this.carga = 100;
        this.tampada = true;
    }
    
/*--------------Geter's e Sete's----------------*/
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    /*---------------------------------------------------*/
    
    public void status(){
        System.out.print("Uma caneta "+ cor);
        System.out.print("Esta tampada? "+ tampada);
        System.out.print("Ponta: " + ponta);
        System.out.print("Modelo: " + modelo);
        System.out.print("Carga: " + carga);
    }
    
    public void Escrever(){
        if(tampada==false && carga>0){
            System.out.print("Ola");
        } else{
            System.out.print("ERRO: Verifique se sua caneta esta destamapada ou tem carga");
        }
    }
    
    public void Tampar(){
        if(tampada==false){
            this.setTampada(true);
        }else{
            System.out.print("Sua caneta ja esta tampada");
        }
    }
    
    public void Destampar(){
        if(tampada==true){
            this.setTampada(false);
        }else{
            System.out.print("Sua caneta ja esta destampada");
        }
    }
}
