package br.com.fiap.healthtrack.medidas.atividadefisica;

import br.com.fiap.healthtrack.medidas.QualificadorMedida;

/**
 * @author Sid
 * Os tipos de atividade f�sica suportados pelo health Track
 *
 */
public enum TipoAtividadeFisica implements QualificadorMedida {
	CORRIDA("Corrida"), CAMINHADA("Caminhada"), PEDALADA("Pedalada"), MUSCULACAO("Muscula��o");

private String descricao;
	
	/**
	 * @param descricao
	 */
	private TipoAtividadeFisica(String descricao) {
		this.descricao = descricao;
	}

	/* (non-Javadoc)
	 * @see br.com.fiap.healthtrack.medidas.QualificadorMedida#getDescricao()
	 */
	@Override
	public String getDescricao() {

		return descricao;
	}

}
