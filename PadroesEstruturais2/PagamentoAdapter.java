package adapter.src.adapter;

import adapter.src.service.Pagamento;
import adapter.src.legacy.SistemaPagamentoAntigo;




public class PagamentoAdapter implements Pagamento {
    private SistemaPagamentoAntigo sistemaAntigo;

    public PagamentoAdapter(SistemaPagamentoAntigo sistemaAntigo) {
        this.sistemaAntigo = sistemaAntigo;
    }

    @Override
    public void pagar(double valor) {
        sistemaAntigo.processarPagamentoAntigo(valor);
    }
}