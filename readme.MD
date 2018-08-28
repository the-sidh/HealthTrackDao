Notas para o professor que for fazer a correção:
-----------------------------------------------

-Como na atividade anterior, fiz uma classe de teste compatível com jUnit, e não uma "classe main", para manter em dia com as melhores práticas do mercado. Esta classe é a br.com.fiap.healthtrack.HealthTrackTest, que esta em src/test/java

-Fiz testes para todas as classes que entity (Peso, AtividadeFisica, Pressao, Alimentacao e Usuario). Como utilizei herança aliada à generics, foi possível implementar um DAO genérico para as 4 primeiras classes e 1 para classe usuário, que pertence a outra árvore de herança.

-O método de teste que segue a rigor o especificado no enunciado da atividade é a testPesoDao(). Por favor use ele para sua avaliação.