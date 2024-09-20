package com.mycompany.predio;
public class Elevador {
    private int andar_atual;
    private int total_andares;
    private int qtd_elevador;
    private int capacidade_elevador;
/*-----------------------Constructor-----------------------*/
    public Elevador(int total_andares, int capacidade_elevador) {
        this.total_andares = total_andares;
        this.capacidade_elevador = capacidade_elevador;
    }
/*-------------------------Moduols-------------------------*/   
    public void Status(){
        System.out.println("Total de andares: "+this.getTotal_andares());
        System.out.println("Andar atual: "+this.getAndar_atual());
        System.out.println("Capacidade do elevador: "+this.getCapacidade_elevador());
        System.out.println("Total de pessoas no elevador: "+this.getQtd_elevador());
    }
    
    public void Entrar(){
        if(this.getQtd_elevador() < this.getCapacidade_elevador()){
            this.setQtd_elevador(this.getQtd_elevador()+1);
            System.out.println("Entrou uma pessoa no elevador");
        } else{
            System.out.println("Seu elevador esta lotado!!");
        }
    }
    
    public void Sair(){
        if(this.getQtd_elevador() != 0){
            System.out.println("Saiu uma pessoa no elevador");
            this.setQtd_elevador(this.getQtd_elevador()-1);
        }else{
            System.out.println("Nao ha ninguem no elevador");
        }
    }
    
    public void Subir(){
        if(this.getAndar_atual() == this.getTotal_andares()){
            System.out.println("Seu elevador ja chegou ao ultimo andar");
        }else{
            this.setAndar_atual(this.getAndar_atual()+1);
            System.out.println("O elevador subiu um andar");
        }
    }
    
    public void Descer(){
        if(this.getAndar_atual() == 0){
            System.out.println("Seu elevador ja chegou no Terreo");
        }else{
            this.setAndar_atual(this.getAndar_atual()-1);
            System.out.println("O elevador desceu um andar");
        }
    }
/*-------------------Geterr's e Seterr's-------------------*/   
    private int getAndar_atual() {
        return andar_atual;
    }

    private void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    private int getTotal_andares() {
        return total_andares;
    }

    private void setTotal_andares(int total_andares) {
        this.total_andares = total_andares;
    }

    private int getQtd_elevador() {
        return qtd_elevador;
    }

    private void setQtd_elevador(int qtd_elevador) {
        this.qtd_elevador = qtd_elevador;
    }

    private int getCapacidade_elevador() {
        return capacidade_elevador;
    }

    private void setCapacidade_elevador(int capacidade_elevador) {
        this.capacidade_elevador = capacidade_elevador;
    } 
}
