package br.com.ana.dao.mocks;

import br.com.ana.dao.IClienteDao;

/**
 * Classe mock para simular operações da interface IClienteDao.
 */
public class ClienteDaoMock implements IClienteDao {

    @Override
    public void salvar() {
        // Implementação mock, apenas simula a operação de salvar.
        System.out.println("Mock: Cliente salvo com sucesso!");
    }
}
