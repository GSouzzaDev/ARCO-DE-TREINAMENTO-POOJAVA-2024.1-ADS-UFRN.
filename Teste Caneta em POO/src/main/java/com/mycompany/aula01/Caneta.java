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
    private String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    private float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    private int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    private boolean getTampada() {
        return tampada;
    }

    private void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    /*---------------------------------------------------*/
    
    public void status(){
        System.out.print("Uma caneta "+ this.getCor());
        System.out.print("Esta tampada? "+ this.getTampada());
        System.out.print("Ponta: " +this.getPonta());
        System.out.print("Modelo: " +this.getModelo());
        System.out.print("Carga: " +this.getCarga());
    }
    
    public void Escrever(){
        if(this.getTampada()==false && this.getCarga()>0){
            System.out.print("Ola");
        } else{
            System.out.print("ERRO: Verifique se sua caneta esta destamapada ou tem carga");
        }
    }
    
    public void Tampar(){
        if(this.getTampada()==false){
            this.setTampada(true);
        }else{
            System.out.print("Sua caneta ja esta tampada");
        }
    }
    
    public void Destampar(){
        if(this.getTampada()==true){
            this.setTampada(false);
        }else{
            System.out.print("Sua caneta ja esta destampada");
        }
    }
    
    public void isTampada(){
        System.out.print(this.getTampada());
    }
}
