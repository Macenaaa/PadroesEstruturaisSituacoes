public class Main {
    public static void main(String[] args) {
        Empregado joao = new Funcionario("João", "Desenvolvedor");
        Empregado maria = new Funcionario("Maria", "Analista");

        Gerente gerenteTI = new Gerente("Carlos", "Gerente de TI");
        gerenteTI.adicionar(joao);
        gerenteTI.adicionar(maria);

        Empregado paula = new Funcionario("Paula", "Secretária");
        Gerente diretor = new Gerente("Ana", "Diretora");
        diretor.adicionar(gerenteTI);
        diretor.adicionar(paula);

        diretor.exibirInformacoes();
    }
}
