# MJV- DevSchool - Java

### Repositório desenvolvido no período de 14/06/2021 a 06/07/2021

![Image](http://s2.glbimg.com/ISAMH15-7x5uueooUfpwrNr_S5I=/s.glbimg.com/jo/g1/f/original/2011/08/22/22-java-300.jpg "Imagem JAVA")

## Collections um resumo sobre a interface SET.

● Collection é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade.

● Serve para armazenar e processar conjuntos de dados de forma eficiente.

● Antes do Java 2 (JDK 1.2), a implementação de coleções na linguagem Java incluía poucas classes e não tinha a organização de um framework.

#### Interface (SET) uma das interfaces que extends Collection

### **Hierarquia Collections** 

![image-20210630120629088](https://beginnersbook.com/wp-content/uploads/2013/12/Java-collection-framework-hierarchy.png)

### Características da Interface Set
  - **Não permite elementos duplicados .** Ao contrário da interface **List**  
  - **Não possui índice:**  Ao contrário da interface **List**  impossibilitando busca de elemento pelo índice.
  - **HashSet:**  Implementa **SET** internamente usa *HashMap* para armazenar os elementos **NÃO** mantêm a ordem dos elementos.
  - **LinkedHashSet:** Implementa **SET** internamente usa *LinkedHashMap* para armazenar os elementos **MANTÊM** a ordem em que os elementos foram inseridos é mais **performático**
  - **TreeSet:** Implementa **SET** internamente usa *TreeMap* para armazenar os elementos **MANTÊM** a ordem **NATURAL** em que os elementos foram inseridos é mais **mais lento em termos de performance**


  ### Exemplo básico de implementação.
  ```java
  public class SetExample {
    public static void main(String[] args)
    {
        // (Set) demonstrando utilização com HashSet
        Set<String> hash_Set = new HashSet<String>();
  
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
  
        System.out.println(hash_Set);
    }
}
  ```

## Descrição das principais Classes que implementam SET
![Image](https://static.wixstatic.com/media/208236_495b99cbd0764831bd7841778f7011fc~mv2.png/v1/fill/w_740,h_416,al_c,lg_1,q_95/208236_495b99cbd0764831bd7841778f7011fc~mv2.webp)

  ## Stack
  - Java 11 - Open JDK
  - Intellij e STS Eclipse como **IDE**
  - Gerenciador de dependências  **MAVEN**
  - JDBC para conexão com banco de dados
  - Hibernate e JPA refatorado posteriormente 

## Objetivo
Repositorio criado durante dev School.
Treinamento na plataforma Java.

## Entregavéis
20/06/2021 (Implementação da classe Printerapp.class)

  

