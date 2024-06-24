package br.com.ana.dao;

/**
 * Interface para operações de contrato no banco de dados.
 */
public interface IContratoDao {
    void salvar();      // Método para salvar um contrato
    void buscar();      // Método para buscar contratos
    void excluir();     // Método para excluir um contrato
    void atualizar();   // Método para atualizar um contrato
}
