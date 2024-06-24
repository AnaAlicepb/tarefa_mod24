package br.com.ana.service;

import br.com.ana.dao.ClienteDao;
import br.com.ana.dao.IClienteDao;

public class Application {
    public static void main(String[] args) {
        IClienteDao clienteDao = new ClienteDao();
        ClienteService service = new ClienteService(clienteDao);
        service.salvar();
    }
}
