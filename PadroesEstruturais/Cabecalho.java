
package decorator;

import decorator.component.Relatorio;

public class Cabecalho extends RelatorioDecorator {
    public Cabecalho(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return "Cabeçalho\n" + super.gerar();
    }
}
