Notas para o professor que for fazer a corre��o:
-----------------------------------------------

-Como na atividade anterior, fiz uma classe de teste compat�vel com jUnit, e n�o uma "classe main", para manter em dia com as melhores pr�ticas do mercado. Esta classe � a br.com.fiap.healthtrack.HealthTrackTest, que esta em src/test/java

-Fiz testes para todas as classes que entity (Peso, AtividadeFisica, Pressao, Alimentacao e Usuario). Como utilizei heran�a aliada � generics, foi poss�vel implementar um DAO gen�rico para as 4 primeiras classes e 1 para classe usu�rio, que pertence a outra �rvore de heran�a.

-O m�todo de teste que segue a rigor o especificado no enunciado da atividade � a testPesoDao(). Por favor use ele para sua avalia��o.