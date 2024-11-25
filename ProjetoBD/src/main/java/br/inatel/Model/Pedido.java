package br.inatel.Model;
import java.util.Date;

public class Pedido {

    int idPedido;
    private int mesaIdMesa;
    private int clienteIdCliente;
    private Date data;


    public Pedido(int idPedido, int mesaIdMesa, int clienteIdCliente, Date data) {
        this.idPedido = idPedido;
        this.mesaIdMesa = mesaIdMesa;
        this.clienteIdCliente = clienteIdCliente;
        this.data = data;
    }


    public int getMesaIdMesa() {
        return mesaIdMesa;
    }

    public int getClienteIdCliente() {
        return clienteIdCliente;
    }

    public Date getData() {
        return data;
    }
}
