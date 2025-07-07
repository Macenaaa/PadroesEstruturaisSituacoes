package decorator;

import decorator.component.Relatorio;

public class RelatorioSimples implements Relatorio {
    @Override
    public String gerar() {
        return "Relatório básico";
    }
}
