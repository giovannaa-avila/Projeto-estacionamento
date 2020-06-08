package proj_estacionamento;

import javax.swing.JOptionPane;

public class Proj_Estacionamento {

    public static void main(String[] args) {
        
        Estacionamento dados = new Estacionamento();
        
        dados.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente:"));
        
        dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do veículo:"));
        
        dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do veículo:"));
        
        dados.setHora_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada:")));
        
        dados.setMinuto_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de entrada:")));
        
        dados.setHora_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de saída:")));
        
        dados.setMinuto_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de saída:")));
        
        dados.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por hora:")));
        
        double total_tempo = dados.calcula_tempo(dados.getHora_entrada(),dados.getMinuto_entrada(), dados.getHora_saida(),dados.getMinuto_saida());
        
        dados.Nota(total_tempo, dados.getPreco());
        
        
    }
    
}
