Notas para o professor que for fazer a corre��o:
-----------------------------------------------

Atividade  Fase 6 cap 9

-Mantive o teste concentrado na classe br.com.fiap.healthtrack.HealthTrackTest que usa jUnit

-Foi criada a classe MedidaOracleDaoImpl, um dao generico para todas as classes entity de medidas (ou seja, todas com exce��o de uu�rio). Como o modelo de BD foi feito antes, algum mapeamento entre as entidades gen�ricas e as tabelas foi necess�rio.

- Para facilitar a corre��o, inclu� dump do meu bd no diret�rio sql_export , na raiz do projeto.

- Para ir al�m do pedido e me aproveitar para arender coisas novas, fiz tamb�m uma implementa��o do dao usando BD NoSQL. No caso optei pelo MongoDB.
criei a classe abstrata NoSQLClientManagerMongoDB e sub classes para cada entidade.

-Adicionei casos de teste do mongoDB na classe de testes tb

-O projeto est� dispon�vel em https://github.com/the-sidh/HealthTrackDao

Versoes anteriores: 

Atividade  Fase 6 cap 3

-Como na atividade anterior, fiz uma classe de teste compat�vel com jUnit, e n�o uma "classe main", para manter em dia com as melhores pr�ticas do mercado. Esta classe � a br.com.fiap.healthtrack.HealthTrackTest, que esta em src/test/java

-Fiz testes para todas as classes que entity (Peso, AtividadeFisica, Pressao, Alimentacao e Usuario). Como utilizei heran�a aliada � generics, foi poss�vel implementar um DAO gen�rico para as 4 primeiras classes e 1 para classe usu�rio, que pertence a outra �rvore de heran�a.

-O m�todo de teste que segue a rigor o especificado no enunciado da atividade � a testPesoDao(). Por favor use ele para sua avalia��o.