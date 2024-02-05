# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Este repositório faze parte do Desafio para teste de conteúdo técnico sobre a linguagem Kotlin trabalhada no Bootcamp Desenvolvimento Backend com Kotlin, promovido pelas gigantes [DIO](https://web.dio.me) e [NTT Data](https://br.nttdata.com/).

Trata-se de um sistema bastante simples que demonstra a simulação do funcionamento básico de uma plataforma educacional a exemplo da DIO.

## Diagrama de classes

``` mermaid
classDiagram
  class Formacao {
    nome: String
    nivel: String
    conteudosEducacionais: List<ConteudoEducacional>
    matricularAluno(aluno: Aluno): void
  }

  class ConteudoEducacional {
    titulo: String
    descricao: String
  }

  class Aluno {
    nome: String
  }

  Formacao *-- ConteudoEducacional
  Formacao *-- Aluno
```

## Tech Stack

**Linguagem:** Kotlin

**Made with:** IntelliJ Community Edition


## 🚀 About Me
Sou um programador backend em formação, atualmente em nível intermediário e ávido por conhecimento. Apaixonado por tecnologia. 😀


## Mais sobre o autor

- [@chrissperb](https://www.github.com/chrissperb)
- [My LinkedIn](www.linkedin.com/in/chrissperb)



## Agradecimentos
 - [DIO](https://web.dio.me)
 - [README.SO](https://readme.so/)


## Texto original do desafio

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**
