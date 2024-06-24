package br.com.ana.dao.mocks;

import br.com.ana.dao.IContratoDao;

/**
 * Classe mock para simular operações da interface IContratoDao.
 */
public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
        // Simulação do método salvar, sem interação com banco de dados.
        System.out.println("Mock: Contrato salvo com sucesso!");
    }

    @Override
    public void buscar() {
        // Simulação do método buscar.
        System.out.println("Mock: Buscando contratos...");
    }

    @Override
    public void excluir() {
        // Simulação do método excluir.
        System.out.println("Mock: Contrato excluído com sucesso!");
    }

    @Override
    public void atualizar() {
        // Simulação do método atualizar.
        System.out.println("Mock: Contrato atualizado com sucesso!");
    }
}
