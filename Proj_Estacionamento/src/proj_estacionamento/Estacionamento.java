package proj_estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {
    
    public String cliente;
    public String placa;
    public String modelo;
    public double hora_entrada;
    public double minuto_entrada;
    public double hora_saida;
    public double minuto_saida;
    protected double preco;
    
     public double calcula_tempo (double hora_entrada, double minuto_entrada, double hora_saida, double minuto_saida){
        
        double conv_ent = hora_entrada + minuto_entrada/60;
        double conv_saida = hora_saida + minuto_saida/60;
        
        double tempo = Math.ceil(conv_saida - conv_ent);      
        return tempo;

    }
    
    public void Nota (double total_tempo, double preco){
        
        double total = total_tempo * preco;
        
        JOptionPane.showMessageDialog(null,"Estacionamento etec MCM \n"   
            + "Dados: \n"
            + "Nome do cliente: " + getCliente()+ "\n"    
            + "Placa: "+ getPlaca()+"\n" + "Modelo: "+getModelo()+"\n"
            + "Entrada: "+ getHora_entrada()+"h e "+ getMinuto_entrada()+"min \n"
            + "Saída: "+ getHora_saida()+"h e "+ getMinuto_saida()+"min \n"
            + "Total de horas: " + total_tempo + "horas \n" + "Valor total: " + total + " reais");
    }
    
  
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public double getHora_entrada(){
        return hora_entrada;
    }
    
    public void setHora_entrada(double hora_entrada){
        this.hora_entrada = hora_entrada;
    }
    
    public double getMinuto_entrada(){
        return minuto_entrada;
    }
    
    public void setMinuto_entrada(double minuto_entrada){
        this.minuto_entrada = minuto_entrada;
    }
    
    public double getHora_saida(){
        return hora_saida;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setHora_saida(double hora_saida){
        this.hora_saida = hora_saida;
    }
    
    public double getMinuto_saida(){
        return minuto_saida;
    }

    
    public void setMinuto_saida(double minuto_saida){
        this.minuto_saida = minuto_saida;
    }    
}
