package com.fiap.challenge.paciente.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fiap.challenge.paciente.api.dto.PacienteDTO;
import com.fiap.challenge.paciente.api.service.PacienteService;

@RunWith(SpringRunner.class)
@WebMvcTest(PacienteController.class)
@EnableWebMvc
class PacienteControllerTest {
	
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private PacienteService service;
 
    @Test
    public void recuperaPacienteComSucesso() throws Exception {
        Mockito.when(service.recuperaPaciente(Mockito.any())).thenReturn(new ResponseEntity<>(new PacienteDTO(), HttpStatus.OK));

        mockMvc.perform(get("/pacientes/{pacienteId}",1)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
    
    @Test
    public void pacienteNaoEncontrado() throws Exception {
        Mockito.when(service.recuperaPaciente(Mockito.any())).thenReturn(new ResponseEntity<>(new PacienteDTO(), HttpStatus.NOT_FOUND));

        mockMvc.perform(get("/pacientes/{pacienteId}",1)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
    
    @Test
    public void falhaAoAtualizarPacienteSemBody() throws Exception {

        mockMvc.perform(patch("/pacientes/{pacienteId}",1)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().is4xxClientError());
    }
    
    @Test
    public void atualizaPacienteComSucesso() throws Exception {
        Mockito.when(service.atualizaDadosPaciente(Mockito.any(),Mockito.any())).thenReturn(new ResponseEntity<>(new PacienteDTO(), HttpStatus.NO_CONTENT));

        mockMvc.perform(patch("/pacientes/{pacienteId}",1)
        		.content("{ \"nome_completo\" : \"Pedro Henrique Dias de Azevedo Campos Martins\", \"nome_mae\" : \"Maria Clara Azevedo Laura\", \"email\" : \"pedro@hotmail.com\" }")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isNoContent());
    }
    
    @Test
    public void pacienteNaoEncontradoParaAtualizacao() throws Exception {
        Mockito.when(service.atualizaDadosPaciente(Mockito.any(),Mockito.any())).thenReturn(new ResponseEntity<>(new PacienteDTO(), HttpStatus.NOT_FOUND));

        mockMvc.perform(patch("/pacientes/{pacienteId}",1)
        		.content("{ \"nome_completo\" : \"Pedro Henrique Dias de Azevedo Campos Martins\", \"nome_mae\" : \"Maria Clara Azevedo Laura\", \"email\" : \"pedro@hotmail.com\" }")
        		.contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

}
