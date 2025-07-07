
import decorator.component.Relatorio;
import decorator.RelatorioSimples;
import decorator.Cabecalho;
import decorator.Assinatura;

public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioSimples();
        relatorio = new Cabecalho(relatorio);
        relatorio = new Assinatura(relatorio);

        System.out.println(relatorio.gerar());
    }
}
