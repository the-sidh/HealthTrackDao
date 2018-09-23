Notas para o professor que for fazer a correção:
-----------------------------------------------

Atividade  Fase 6 cap 9

-Mantive o teste concentrado na classe br.com.fiap.healthtrack.HealthTrackTest que usa jUnit

-Foi criada a classe MedidaOracleDaoImpl, um dao generico para todas as classes entity de medidas (ou seja, todas com exceção de uuário). Como o modelo de BD foi feito antes, algum mapeamento entre as entidades genéricas e as tabelas foi necessário.

- Para facilitar a correção, incluí dump do meu bd no diretório sql_export , na raiz do projeto.

- Para ir além do pedido e me aproveitar para arender coisas novas, fiz também uma implementação do dao usando BD NoSQL. No caso optei pelo MongoDB.
criei a classe abstrata NoSQLClientManagerMongoDB e sub classes para cada entidade.

-Adicionei casos de teste do mongoDB na classe de testes tb

-O projeto está disponível em https://github.com/the-sidh/HealthTrackDao

Versoes anteriores: 

Atividade  Fase 6 cap 3

-Como na atividade anterior, fiz uma classe de teste compatível com jUnit, e não uma "classe main", para manter em dia com as melhores práticas do mercado. Esta classe é a br.com.fiap.healthtrack.HealthTrackTest, que esta em src/test/java

-Fiz testes para todas as classes que entity (Peso, AtividadeFisica, Pressao, Alimentacao e Usuario). Como utilizei herança aliada à generics, foi possível implementar um DAO genérico para as 4 primeiras classes e 1 para classe usuário, que pertence a outra árvore de herança.

-O método de teste que segue a rigor o especificado no enunciado da atividade é a testPesoDao(). Por favor use ele para sua avaliação.