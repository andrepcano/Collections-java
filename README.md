# Collections & Generics — Java

Exercícios práticos sobre **Generics** e **Java Collections Framework**.

---

## Estrutura do projeto

```
src/
└── Generics/
    ├── Ex1/
    │   ├── application/
    │   │   └── Main.java
    │   ├── entities/
    │   │   ├── Product.java
    │   │   ├── Notebook.java
    │   │   └── Smartphone.java
    │   └── services/
    │       ├── CalcService.java
    │       └── Tributavel.java (interface)
    │
    ├── Ex2/
    │   ├── application/
    │   │   └── Main.java
    │   ├── entities/
    │   │   ├── Employee.java
    │   │   ├── Developer.java
    │   │   └── Manager.java
    │   └── services/
    │       ├── MaxService.java
    │       └── Bonificavel.java (interface)
    │
    └── ExExemplo/
        ├── application/
        │   └── Main.java
        ├── entities/
        │   └── Product.java
        └── services/
            └── CalculationService.java
```

---

## Projetos

### Ex1 — Produtos e Tributação
Sistema de produtos com cálculo de imposto usando Generics e Comparable.

**Entidades:** `Product`, `Notebook`, `Smartphone`
**Interface:** `Tributavel`
**Serviço:** método genérico `max()` para encontrar o maior produto por preço

### Ex2 — Funcionários e Bonificação
Sistema de funcionários com cálculo de bônus usando Generics, Comparable e herança.

**Entidades:** `Employee`, `Developer`, `Manager`
**Interface:** `Bonificavel`
**Serviço:** método genérico `max()` para encontrar o maior salário + `imprimirLista()`

### ExExemplo — Serviço de Cálculo
Exemplo base do método genérico `max()` com `<T extends Comparable<? super T>>`.

---

## Conceitos aplicados

- Generics com bounded wildcards `<T extends Comparable<? super T>>`
- Interface `Comparable` e método `compareTo()`
- Herança e interfaces (`Tributavel`, `Bonificavel`)
- `List` e `ArrayList`
- Métodos estáticos genéricos

---

## 🛠️ Tecnologias

Java 25 · IntelliJ IDEA · Git e GitHub

---

## Como executar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/collections-java.git

# Abra no IntelliJ e execute a classe Main de cada exercício
```



## 👨🏻‍💻 Autor

Feito por **André Peixoto Cano** — Estudante de Engenharia de Software na FIAP, aprendendo Java com o curso do professor Nélio Alves na Udemy.
