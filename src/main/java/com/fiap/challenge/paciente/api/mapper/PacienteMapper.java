package com.fiap.challenge.paciente.api.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.fiap.challenge.paciente.api.dto.PacienteDTO;
import com.fiap.challenge.paciente.api.model.HmvPaciente;

@Mapper
public interface PacienteMapper {
    PacienteDTO pacienteEntityToDto(HmvPaciente paciente);
    HmvPaciente pacienteDTOToEntity(PacienteDTO paciente);
    
    @Mapping(target = "hmvPacienteId", ignore=true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePacienteFromDto(PacienteDTO dto, @MappingTarget HmvPaciente entity);
}

