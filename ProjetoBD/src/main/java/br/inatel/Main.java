package br.inatel;
import br.inatel.DAO.ClienteDAO;
import br.inatel.DAO.MesaDAO;
import br.inatel.Model.Cliente;
import br.inatel.Model.Mesa;

public class Main {

    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();
        MesaDAO mesaDAO = new MesaDAO();

        clienteDAO.connectToDb();
        mesaDAO.connectToDb();

        Cliente cliente = new Cliente("João Silva", "1234545689", 1, "11999999999", "joaozinmatador@example.com");
        clienteDAO.insertUser(cliente);
        Cliente cliente2 = new Cliente("João", "1234989789", 2, "1188888888", "joao@example.com");
        clienteDAO.insertUser(cliente2);
        Cliente cliente3= new Cliente("Silva", "1234563429", 3, "11777777777", "silva12@hotmail.com");
        clienteDAO.insertUser(cliente3);


        Cliente clienteAtualizado = new Cliente("Maria Souza", "10987654321", 4, "1166666666", "maria@example.com");
        clienteDAO.updateUser(4, clienteAtualizado);

        clienteDAO.deleteUser(2);

        clienteDAO.selectUser();

        Mesa mesa = new Mesa(0, 5, 4);
        mesaDAO.insertMesa(mesa);

        Mesa mesaAtualizada = new Mesa(1, 10, 6);
        mesaDAO.updateMesa(1, mesaAtualizada);

        mesaDAO.deleteMesa(3);

        mesaDAO.selectMesas();




    }
}


