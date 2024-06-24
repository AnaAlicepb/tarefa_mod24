package br.com.ana.service;

import br.com.ana.dao.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public void salvar() {
        clienteDao.salvar();
    }
}
