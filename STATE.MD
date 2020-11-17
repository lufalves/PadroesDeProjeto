# **Markdown**
## 1. **Pattern Name and Classification:**
* Padrão state
* Padrão Comportamental
## 2. **Intent:**

*  Permite que um objeto altere o seu comportamento quando o seu estado interno muda.

## 3. **Motivation:**

* O padrão State é motivado por aqueles objetos que, em seu estado atual, varia o seu comportamento devido as diferentes mensagens que possa receber.
## 4. **Applicability:**

* a aplicabilidade é simplificar os casos em que o código é complicado e extenso de decisão que depende do estado do objeto

## 5. **Structure:**
![state](https://www.thiengo.com.br/img/post/normal/f8vu2jt9hh2fcendvulf6qb7t25c6729cbf88ac0a377c8f7003bf9365e.jpg)

## 6. **Participants:**

######    **Context:**
* Define a interface com o cliente e mantém a instância de estado concreto o qual define o estado atual do objeto.
######    **State:**
* Interface que permite encapsular as responsabilidades associadas ao estado particular de contexto.
######    **ConcreteState:**
* Um ou mais estados concretos que implementam a interface estado.

## 7. **Sample Code:**
1. [github.com/lufalves/PadroesDeProjeto/padroes/src/br/padroes/state/](https://github.com/lufalves/PadroesDeProjeto/tree/master/padroes/src/br/padroes/state)
