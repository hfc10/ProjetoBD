package br.inatel.DAO;
import br.inatel.Model.Pedido_has_Prato;
import java.sql.SQLException;
import java.util.ArrayList;

public class Pedido_has_PratoDAO extends ConnectionDAO{

    public boolean insertItens(Pedido_has_Prato pedidoHasPrato) {
        connectToDb();

        boolean sucesso;
        String sql = "INSERT INTO pedidoHasPrato (pedidoIdPedido, pratoIdPrato, quantidade) VALUES (?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, pedidoHasPrato.getPedidoIdPedido());
            pst.setInt(2, pedidoHasPrato.getPratoIdPrato());
            pst.setInt(3, pedidoHasPrato.getQuantidade());
            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean updateItens(int id, Pedido_has_Prato itens) {
        connectToDb();

        boolean sucesso;
        String sql = "UPDATE itens SET pratoIdPrato = ?, quantidade = ? WHERE pedidoIdPedido = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, itens.getPratoIdPrato());
            pst.setInt(2, itens.getQuantidade());
            pst.setInt(3, id);
            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deleteItens(int id) {
        connectToDb();

        boolean sucesso;
        String sql = "DELETE FROM itens WHERE pedidoIdPedido = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public ArrayList<Pedido_has_Prato> selectItens() {
        connectToDb();

        ArrayList<Pedido_has_Prato> Itens = new ArrayList<>();
        String sql = "SELECT * FROM itens";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Itens");
            while (rs.next()) {
                Pedido_has_Prato itens1 = new Pedido_has_Prato(rs.getInt("pedidoIdPedido"), rs.getInt("pratoIdPrato"), rs.getInt("quantidade"));
                System.out.println("Id do pedido:  " + itens1.getPedidoIdPedido() + " Id do prato: " + itens1.getPratoIdPrato() +" Quantidade: " + itens1.getQuantidade());
                System.out.println("--------------------");
                Itens.add(itens1);
            }

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                con.close();
                st.close();
                rs.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return Itens;
    }
}
