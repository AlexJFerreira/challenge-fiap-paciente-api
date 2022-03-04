package com.fiap.challenge.paciente.api.dto;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PacienteDTO {

	@JsonProperty(value = "paciente_id", access = JsonProperty.Access.READ_ONLY)
	private int hmvPacienteId;

	@JsonProperty("nome_completo")
	private String hmvPacienteNomeCompleto;

	@JsonProperty("data_nascimento")
	private LocalDate hmvPacienteDataNascimento;

	@JsonProperty("nome_mae")
	private String hmvPacienteNomeMae;

	@JsonProperty("cpf")
	private String hmvPacienteCodigoCpf;

	@JsonProperty("endereco")
	private String hmvPacienteEndereco;

	@JsonProperty("telefone")
	private String hmvPacienteTelefone;

	@JsonProperty("email")
	private String hmvPacienteEmail;

	public int getHmvPacienteId() {
		return hmvPacienteId;
	}

	public void setHmvPacienteId(int hmvPacienteId) {
		this.hmvPacienteId = hmvPacienteId;
	}

	public String getHmvPacienteNomeCompleto() {
		return hmvPacienteNomeCompleto;
	}

	public void setHmvPacienteNomeCompleto(String hmvPacienteNomeCompleto) {
		this.hmvPacienteNomeCompleto = hmvPacienteNomeCompleto;
	}

	public LocalDate getHmvPacienteDataNascimento() {
		return hmvPacienteDataNascimento;
	}

	public void setHmvPacienteDataNascimento(LocalDate hmvPacienteDataNascimento) {
		this.hmvPacienteDataNascimento = hmvPacienteDataNascimento;
	}

	public String getHmvPacienteNomeMae() {
		return hmvPacienteNomeMae;
	}

	public void setHmvPacienteNomeMae(String hmvPacienteNomeMae) {
		this.hmvPacienteNomeMae = hmvPacienteNomeMae;
	}

	public String getHmvPacienteCodigoCpf() {
		return hmvPacienteCodigoCpf;
	}

	public void setHmvPacienteCodigoCpf(String hmvPacienteCodigoCpf) {
		this.hmvPacienteCodigoCpf = hmvPacienteCodigoCpf;
	}

	public String getHmvPacienteEndereco() {
		return hmvPacienteEndereco;
	}

	public void setHmvPacienteEndereco(String hmvPacienteEndereco) {
		this.hmvPacienteEndereco = hmvPacienteEndereco;
	}

	public String getHmvPacienteTelefone() {
		return hmvPacienteTelefone;
	}

	public void setHmvPacienteTelefone(String hmvPacienteTelefone) {
		this.hmvPacienteTelefone = hmvPacienteTelefone;
	}

	public String getHmvPacienteEmail() {
		return hmvPacienteEmail;
	}

	public void setHmvPacienteEmail(String hmvPacienteEmail) {
		this.hmvPacienteEmail = hmvPacienteEmail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hmvPacienteCodigoCpf, hmvPacienteDataNascimento, hmvPacienteEmail, hmvPacienteEndereco,
				hmvPacienteId, hmvPacienteNomeCompleto, hmvPacienteNomeMae, hmvPacienteTelefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacienteDTO other = (PacienteDTO) obj;
		return Objects.equals(hmvPacienteCodigoCpf, other.hmvPacienteCodigoCpf)
				&& Objects.equals(hmvPacienteDataNascimento, other.hmvPacienteDataNascimento)
				&& Objects.equals(hmvPacienteEmail, other.hmvPacienteEmail)
				&& Objects.equals(hmvPacienteEndereco, other.hmvPacienteEndereco)
				&& hmvPacienteId == other.hmvPacienteId
				&& Objects.equals(hmvPacienteNomeCompleto, other.hmvPacienteNomeCompleto)
				&& Objects.equals(hmvPacienteNomeMae, other.hmvPacienteNomeMae)
				&& Objects.equals(hmvPacienteTelefone, other.hmvPacienteTelefone);
	}

	@Override
	public String toString() {
		return "PacienteDTO [hmvPacienteId=" + hmvPacienteId + ", hmvPacienteNomeCompleto=" + hmvPacienteNomeCompleto
				+ ", hmvPacienteDataNascimento=" + hmvPacienteDataNascimento + ", hmvPacienteNomeMae="
				+ hmvPacienteNomeMae + ", hmvPacienteCodigoCpf=" + hmvPacienteCodigoCpf + ", hmvPacienteEndereco="
				+ hmvPacienteEndereco + ", hmvPacienteTelefone=" + hmvPacienteTelefone + ", hmvPacienteEmail="
				+ hmvPacienteEmail + "]";
	}

}
