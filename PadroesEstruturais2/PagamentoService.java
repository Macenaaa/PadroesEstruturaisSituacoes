package adapter.src.service;

import adapter.src.adapter.PagamentoAdapter;
import adapter.src.legacy.SistemaPagamentoAntigo;


public class PagamentoService {
    private final Pagamento pagamento;

    public PagamentoService() {
        SistemaPagamentoAntigo sistemaAntigo = new SistemaPagamentoAntigo();
        this.pagamento = new PagamentoAdapter(sistemaAntigo);
    }

    public void processar(double valor) {
        pagamento.pagar(valor);
    }
}