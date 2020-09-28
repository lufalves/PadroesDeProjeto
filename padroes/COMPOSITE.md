# **Markdown**
## 1. **Pattern Name and Classification:**
* Padrão Composite
* Padrão Estrutural
## 2. **Intent:**
* Modifica a estruttura de um objeto
## 3. **Motivition:**
* Para casos que requerem objetos que se comportam como estrutura em árvore para
    representar hierarquias.
## 4. **Applicability:**
* Em estrutura hierárquica como grafo ou árvore que requer funcionalidade genérica por toda a estrutura
    Aplicações onde precisa agregar dados por toda hierárquias.
    Aplicção que precisa tratar a composição e objetodos de maneira individuais e  uniforme
## 5. **Structure:**
 ![Structure Composite Basic](https://upload.wikimedia.org/wikipedia/commons/3/39/W3sDesign_Composite_Design_Pattern_Type_Safety_UML.jpg)
## 6. **Participants:**
######    **Component:**
* Declara interface para objetos da composição
* Implementa comportamentos padrão comuns para todas as classes
* Declara uma interface para acessar e gerenciar componentes filho
######    **Leaf:**
* Representa objetos folha da consição que não tem filhos
* Define o comportamento para objetos primitivos.
######    **Composite:**
* Define o comportamento para componentes que possuem filhos
* Armazena componentes filhos
* Implementa operações relacionadas a filhos e definidas na interface Component
######    **Client**
* Manipula os objetos da composição via interface Component    
###### 7. **Sample Code:**
[github.com/lufalves23/PadroesDeProjeto/padroes/src/br/padroes/composite/](https://github.com/lufalves/PadroesDeProjeto/tree/master/padroes/src/br/padroes/composite)
