import javax.naming.Name;

public class Animal {
    public static class cachorro extends Animal {
    }


    public static void main(String[] args) {
        cachorro cachorro1 = new cachorro();
        Animal animal = cachorro1;
        if (animal instanceof cachorro) {
            System.out.println("Is True");
            System.out.println(animal instanceof cachorro);
        }
    }
}

/*
Você tem razão: no **dia a dia de código simples**, a gente quase não vê alguém escrevendo casting manual entre classes o tempo todo.
Mas em **sistemas maiores** e com **polimorfismo**, isso aparece bastante.

---

        ## 📌 Onde *upcasting* e *downcasting* aparecem de verdade

### 1. **Trabalhando com coleções genéricas**

Imagine que você tenha uma lista que guarda vários tipos de animais:

        ```java
List<Animal> animais = new ArrayList<>();
animais.add(new Cachorro());
        animais.add(new Gato());
        ```

        * Aqui você faz **upcasting** automaticamente, porque a lista aceita `Animal` e você passa `Cachorro` e `Gato`.
        * Quando for tirar da lista e quiser usar métodos específicos de `Cachorro`, vai precisar fazer **downcasting**:

        ```java
Cachorro c = (Cachorro) animais.get(0);
c.latir();
```

        ---

        ### 2. **Trabalhando com APIs genéricas**

        * Muitas bibliotecas retornam objetos como o tipo mais genérico possível (`Object` ou uma superclasse).
        * Você precisa fazer **casting** para o tipo real antes de usar.
        Exemplo: métodos que retornam `Object` a partir de um Map ou JSON.

---

        ### 3. **Polimorfismo em frameworks**

        * Em frameworks como Spring, Hibernate ou JavaFX, você recebe um **tipo genérico** (por exemplo `Animal`) e o objeto real só é conhecido em tempo de execução.
* O cast serve para acessar comportamentos específicos da subclasse.

---

        ### 4. **Implementações genéricas e reaproveitamento de código**

        * Um método pode aceitar um parâmetro de tipo mais genérico para trabalhar com várias subclasses.
* Internamente, dependendo da lógica, pode haver a necessidade de **converter de volta** para o tipo específico.

        ---

        💡 **Resumo da utilidade real**

        > Casting é útil quando você **trabalha com objetos em um contexto genérico**, mas em algum momento precisa tratar um deles de forma **específica**, usando comportamentos que só existem na subclasse.

---

*/