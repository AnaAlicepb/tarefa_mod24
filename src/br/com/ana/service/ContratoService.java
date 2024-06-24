package br.com.ana.service;

import br.com.ana.dao.IContratoDao;

/**
 * Serviço para gerenciar contratos.
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar(); // Chama o método salvar do DAO
        return "Sucesso"; // Retorna uma mensagem de sucesso
    }
}
