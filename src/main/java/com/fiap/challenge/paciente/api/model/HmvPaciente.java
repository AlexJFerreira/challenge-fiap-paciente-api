// Generated with g9.

package com.fiap.challenge.paciente.api.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "hmv_paciente")
public class HmvPaciente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hmv_paciente_id", unique = true, nullable = false, precision = 10)
	private Integer hmvPacienteId;

	@Column(name = "hmv_paciente_nome_completo", length = 45)
	private String hmvPacienteNomeCompleto;

	@Column(name = "hmv_paciente_data_nascimento")
	private LocalDate hmvPacienteDataNascimento;

	@Column(name = "hmv_paciente_nome_mae", length = 45)
	private String hmvPacienteNomeMae;

	@Column(name = "hmv_paciente_codigo_cpf", length = 20)
	private String hmvPacienteCodigoCpf;

	@Column(name = "hmv_paciente_endereco", length = 255)
	private String hmvPacienteEndereco;

	@Column(name = "hmv_paciente_telefone", length = 20)
	private String hmvPacienteTelefone;

	@Column(name = "hmv_paciente_email", length = 45)
	private String hmvPacienteEmail;

	public Integer getHmvPacienteId() {
		return hmvPacienteId;
	}

	public void setHmvPacienteId(Integer hmvPacienteId) {
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
		HmvPaciente other = (HmvPaciente) obj;
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
		return "HmvPaciente [hmvPacienteId=" + hmvPacienteId + ", hmvPacienteNomeCompleto=" + hmvPacienteNomeCompleto
				+ ", hmvPacienteDataNascimento=" + hmvPacienteDataNascimento + ", hmvPacienteNomeMae="
				+ hmvPacienteNomeMae + ", hmvPacienteCodigoCpf=" + hmvPacienteCodigoCpf + ", hmvPacienteEndereco="
				+ hmvPacienteEndereco + ", hmvPacienteTelefone=" + hmvPacienteTelefone + ", hmvPacienteEmail="
				+ hmvPacienteEmail + "]";
	}

}
