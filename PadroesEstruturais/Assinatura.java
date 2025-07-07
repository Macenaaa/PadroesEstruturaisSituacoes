
package decorator;

import decorator.component.Relatorio;

public class Assinatura extends RelatorioDecorator {
    public Assinatura(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return super.gerar() + "\nAssinatura do responsável";
    }
}
