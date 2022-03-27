package com.fiap.challenge.paciente.api.mapper;

import com.fiap.challenge.paciente.api.dto.PacienteDTO;
import com.fiap.challenge.paciente.api.model.HmvPaciente;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-23T22:25:44-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class PacienteMapperImpl implements PacienteMapper {

    @Override
    public PacienteDTO pacienteEntityToDto(HmvPaciente paciente) {
        if ( paciente == null ) {
            return null;
        }

        PacienteDTO pacienteDTO = new PacienteDTO();

        if ( paciente.getHmvPacienteId() != null ) {
            pacienteDTO.setHmvPacienteId( paciente.getHmvPacienteId() );
        }
        pacienteDTO.setHmvPacienteNomeCompleto( paciente.getHmvPacienteNomeCompleto() );
        pacienteDTO.setHmvPacienteDataNascimento( paciente.getHmvPacienteDataNascimento() );
        pacienteDTO.setHmvPacienteNomeMae( paciente.getHmvPacienteNomeMae() );
        pacienteDTO.setHmvPacienteCodigoCpf( paciente.getHmvPacienteCodigoCpf() );
        pacienteDTO.setHmvPacienteEndereco( paciente.getHmvPacienteEndereco() );
        pacienteDTO.setHmvPacienteTelefone( paciente.getHmvPacienteTelefone() );
        pacienteDTO.setHmvPacienteEmail( paciente.getHmvPacienteEmail() );

        return pacienteDTO;
    }

    @Override
    public HmvPaciente pacienteDTOToEntity(PacienteDTO paciente) {
        if ( paciente == null ) {
            return null;
        }

        HmvPaciente hmvPaciente = new HmvPaciente();

        hmvPaciente.setHmvPacienteId( paciente.getHmvPacienteId() );
        hmvPaciente.setHmvPacienteNomeCompleto( paciente.getHmvPacienteNomeCompleto() );
        hmvPaciente.setHmvPacienteDataNascimento( paciente.getHmvPacienteDataNascimento() );
        hmvPaciente.setHmvPacienteNomeMae( paciente.getHmvPacienteNomeMae() );
        hmvPaciente.setHmvPacienteCodigoCpf( paciente.getHmvPacienteCodigoCpf() );
        hmvPaciente.setHmvPacienteEndereco( paciente.getHmvPacienteEndereco() );
        hmvPaciente.setHmvPacienteTelefone( paciente.getHmvPacienteTelefone() );
        hmvPaciente.setHmvPacienteEmail( paciente.getHmvPacienteEmail() );

        return hmvPaciente;
    }

    @Override
    public void updatePacienteFromDto(PacienteDTO dto, HmvPaciente entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getHmvPacienteNomeCompleto() != null ) {
            entity.setHmvPacienteNomeCompleto( dto.getHmvPacienteNomeCompleto() );
        }
        if ( dto.getHmvPacienteDataNascimento() != null ) {
            entity.setHmvPacienteDataNascimento( dto.getHmvPacienteDataNascimento() );
        }
        if ( dto.getHmvPacienteNomeMae() != null ) {
            entity.setHmvPacienteNomeMae( dto.getHmvPacienteNomeMae() );
        }
        if ( dto.getHmvPacienteCodigoCpf() != null ) {
            entity.setHmvPacienteCodigoCpf( dto.getHmvPacienteCodigoCpf() );
        }
        if ( dto.getHmvPacienteEndereco() != null ) {
            entity.setHmvPacienteEndereco( dto.getHmvPacienteEndereco() );
        }
        if ( dto.getHmvPacienteTelefone() != null ) {
            entity.setHmvPacienteTelefone( dto.getHmvPacienteTelefone() );
        }
        if ( dto.getHmvPacienteEmail() != null ) {
            entity.setHmvPacienteEmail( dto.getHmvPacienteEmail() );
        }
    }
}
