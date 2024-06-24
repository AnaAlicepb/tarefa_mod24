package br.com.ana.dao;

public class ClienteDao implements IClienteDao {

    public ClienteDao() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void salvar() {
        // Aqui vai a lógica para salvar um cliente no banco de dados
        System.out.println("Cliente salvo com sucesso!");
    }
}
