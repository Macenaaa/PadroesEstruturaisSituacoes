import java.util.ArrayList;
import java.util.List;

public class Gerente implements Empregado {
    private String nome;
    private String cargo;
    private List<Empregado> subordinados;

    public Gerente(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.subordinados = new ArrayList<>();
    }

    public void adicionar(Empregado e) {
        subordinados.add(e);
    }

    public void remover(Empregado e) {
        subordinados.remove(e);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(cargo + ": " + nome);
        for (Empregado e : subordinados) {
            e.exibirInformacoes(); // chamada recursiva
        }
    }
}
