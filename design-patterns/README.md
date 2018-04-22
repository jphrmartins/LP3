# Padrões de projeto (Design Patterns)

### Padrões de Criação (Creational design patterns)
Atuam na criação de objetos, abstraindo a complexidade de criação,
minimizando dependencias entre os componentes.
- _Abstract Factory_: Cria uma instância de várias famílias de classes
- _Construtor_: Separa a construção do objeto de sua representação
- _Factory Method_: Cria uma instância de várias classes derivadas
- _Object Pool_: evite aquisições caras e liberação de recursos pela reciclagem de objetos que não estão mais em uso
- _Prototype_: uma instância totalmente inicializada para ser copiada ou clonada
- _Singleton_: Uma classe da qual apenas uma única instância pode existir

### Padrões Estruturais (Structural design patterns)
Utilizamos padrões Estruturais para compor objetos mais complexos,
visando simplificar adicionar mais flexibilidade a solução.
- _Adapter_: interfaces de correspondência entre diferentes classes
- _Bridge_: separa a interface de um objeto da sua implementação
- _Composite_: Uma estrutura de árvore de objetos simples e compostos
- _Decorador_: Adicionar responsabilidades aos objetos dinamicamente
- _Facade_: uma única classe que representa um subsistema inteiro
- _Flyweight_: uma instância refinada usada para compartilhamento eficiente
- _Private Class Data_: Restringe o acesso do acessador / mutador
- _Proxy_: um objeto representando outro objeto

### Padrões Comportamentais (Behavioral design patterns)
Focado na comunicação entre as classes, ajudando a definir as responsabilidades de cada objeto.
- _Chain of responsibility_: uma maneira de passar uma requisição entre uma cadeia de objetos
- _Command_: Encapsula uma solicitação de comando como um objeto
- _Interpreter_: uma maneira de incluir elementos de linguagem em um programa
- _Iterator_: acessar sequencialmente os elementos de uma coleção
- _Mediator_: Define a comunicação simplificada entre classes
- _Memento_: Capture e restaure o estado interno de um objeto
- _Null Object_: Projetado para agir como um valor padrão de um objeto
- _Observer_: Uma maneira de notificar a mudança para um número de classes
- _State_: altera o comportamento de um objeto quando seu estado muda
- _Estrategy_: encapsula um algoritmo dentro de uma classe
- _Template method_: adiar as etapas exatas de um algoritmo para uma subclasse
- _Visitor_: define uma nova operação para uma turma sem alteração