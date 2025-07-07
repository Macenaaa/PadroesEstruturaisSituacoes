package decorator;
import decorator.component.Relatorio;
import decorator.src.RelatorioDecorator;



public class Rodape extends Relatorio{
    @Override
    public String gerar() {
        return super.gerar() + "com Rodapé";
    }
    
}
