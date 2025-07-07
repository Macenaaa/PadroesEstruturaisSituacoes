# Situações de Aprendizagem

### Situação 1: Integração de sistemas legados (Adapter)

Você precisa integrar um sistema de pagamento antigo com uma nova API moderna. As interfaces são diferentes. Como você faria para reaproveitar o código antigo sem alterar sua estrutura?

### Situação 2: Customização de relatórios (Decorator)

Usuários do sistema podem escolher gerar relatórios com ou sem cabeçalho, rodapé ou assinatura. Como permitir essa flexibilidade sem criar várias classes diferentes para cada combinação?

### Situação 3: Estrutura Organizacional de Empresa (Composite)

Você precisa exibir a hierarquia de uma empresa, onde gerentes podem ter subordinados (funcionários ou outros gerentes). Como representar essa estrutura de forma recursiva com uma interface única e tratamento uniforme?



# 🔍 Perguntas de Checagem

**1. Qual é o papel do padrão Adapter? Quando ele é útil?**
Adapter serve para fazer duas interfaces diferentes funcionarem juntas.
Útil quando: você tem uma classe que faz o que você precisa, mas não usa o nome ou formato que seu código espera.
Exemplo:
Seu sistema usa pagar(), mas a classe antiga só tem realizarPagamento(). O Adapter faz a ponte entre eles.

**2. Dê um exemplo prático do uso de Decorator.**
O Decorator é usado para adicionar funcionalidades a um objeto sem mudar sua classe.
Exemplo:
Você tem um relatório simples. Quer adicionar cabeçalho, rodapé, assinatura, etc.

```
Relatorio rel = new RelatorioSimples();
rel = new Cabecalho(rel);
rel = new Assinatura(rel);
System.out.println(rel.gerar());
```


**3. Por que o padrão Composite facilita a manipulação de estruturas hierárquicas?**
Porque ele permite tratar objetos simples e compostos da mesma forma.
Exemplo:
Funcionario e Gerente usam a mesma interface. Você pode chamar exibirInformacoes() nos dois, mesmo o gerente tendo vários subordinados.

**4. Qual padrão você usaria para adicionar funcionalidades extras a um componente visual?**
👉 Decorator
Ele deixa você encapar um componente com outros que adicionam coisas novas (como borda, cor, rolagem, etc), sem mexer no código original.

**5. Em qual padrão você trataria objetos e coleções de objetos da mesma maneira?**
👉 Composite
Você usa o mesmo método para lidar com um único objeto (como um funcionário) ou com uma estrutura com muitos (como um gerente com subordinados).
