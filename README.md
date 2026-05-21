# Collections & Generics — Java
Exercícios práticos sobre **Generics** e **Java Collections Framework**.

---

```
## Estrutura do projeto
src/
├── Generics/
│   ├── Ex1/
│   ├── Ex2/
│   ├── ExExemplo/
│   └── ExFixacao/
│       ├── application/
│       │   └── Main.java
│       ├── entities/
│       │   ├── Livro.java
│       │   ├── Eletronico.java
│       │   └── Estoque.java
│       └── services/
│           └── Precificavel.java
│
├── Map/
│   ├── Ex1/
│   ├── Ex2/
│   └── ExFixacao/
│       ├── application/
│       │   └── Program.java
│       └── entities/
│           └── Candidate.java
│
└── Set/
├── Ex1/
├── Ex2/
├── Ex3HashCodeEEquals/
└── Ex4Comparable/
├── entities/
│   └── Product4.java
└── Program4.java

```

---

---

## Exercícios

### Generics
Criação de métodos e classes genéricas com bounded wildcards e `Comparable`.

- **Ex1** — Produtos (`Product`, `Notebook`, `Smartphone`) com cálculo de imposto via interface `Tributavel` e método genérico `max()`
- **Ex2** — Funcionários (`Employee`, `Developer`, `Manager`) com bônus via interface `Bonificavel` e método genérico `max()`
- **ExExemplo** — Exemplo base do método genérico `max()` com `<T extends Comparable<? super T>>`
- **ExFixacao** — Sistema de estoque genérico (`Livro`, `Eletronico`) com interface `Precificavel`, calculando o mais barato, mais caro e média de preços via classe genérica `Estoque<T extends Precificavel>`

### Set
Coleção de elementos únicos sem índice, com verificação de pertencimento em O(1).

- **Ex1 / Ex2** — Operações básicas com `HashSet`
- **Ex3 — HashCode e Equals** — Como o `Set` identifica elementos duplicados com `equals()` e `hashCode()`
- **Ex4 — Comparable** — Ordenação de elementos com `TreeSet` e `compareTo()`

### Map
Coleção de pares chave → valor com chaves únicas.

- **Ex1 / Ex2** — Operações básicas com `HashMap`
- **ExFixacao** — Consolidação de votos por candidato lendo arquivo `.csv`, acumulando votos de múltiplas urnas por nome usando `Map<String, Candidate>` e `TreeMap` para ordenação alfabética

---

## Conceitos aplicados
- Generics com bounded wildcards `<T extends Comparable<? super T>>`
- Interface `Comparable` e método `compareTo()`
- Herança e interfaces (`Tributavel`, `Bonificavel`, `Precificavel`)
- `HashSet`, `TreeSet` — unicidade e ordenação
- `HashMap`, `TreeMap` — associação chave-valor
- `equals()` e `hashCode()` — identidade de objetos em coleções
- Leitura de arquivos com `BufferedReader` e `FileReader`
- `List` e `ArrayList`

---

## Tecnologias
Java 25 · IntelliJ IDEA · Git e GitHub

---

## Como executar
```bash
git clone https://github.com/seu-usuario/collections-java.git
# Abra no IntelliJ e execute a classe Main/Program de cada exercício
```

## Autor
Feito por **André Peixoto Cano** — Estudante de Engenharia de Software na FIAP,
aprendendo Java com o curso do professor Nélio Alves na Udemy.
