# **Markdown**
## 1. **Pattern Name and Classification:**
* Padrão Observer
* Padrão Comportamental
## 2. **Intent:**
*  Permitir que objeto publique mudanças de estado. Além disso
permite que outros objetos se inscrevam para receber notificações sobre estas mudanças.
## 3. **Motivition:**
* Proporciona baixo acoplamento entre a classe que notifica sobre mudanças e outras classes que recebem esta notificação.
* A classe a ser observada possui uma coleção de observadores que são definidos em tempo de execução (runtime).
## 4. **Applicability:**
* Receber notificação sobre mudanças de estado em outros objetos quando esta mudança for relevante.
* Diminuir acoplamento entre classes dependentes através do encapsulamento.
* Quando uma mudança a um objetos requer mudanças a outros e você não sabe quantos outros objetos devem mudar ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os objetos.
## 5. **Structure:**
![Observer](https://upload.wikimedia.org/wikipedia/commons/8/8d/Observer.svg)
## 6. **Participants:**
######    **Subject:**
* É a classe que possui a informação o estado que se deseja observar.
######    **Observer:**
* Interface que define os métodos de notificação de interesse dos observadores. 
######    **ConcreteObserverA, ConcreteObserverB:**
* Classes concretas que observam a classe Subject. 


## 7. **Sample Code:**
1. [github.com/lufalves/PadroesDeProjeto/bin/br/padroes/composite/](https://github.com/lufalves/PadroesDeProjeto/tree/master/bin/br/padroes/composite)
