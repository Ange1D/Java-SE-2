package com.example.demo.negocio;

import com.example.demo.model.Casa;

public interface CasaService {

    void guardar(Casa casa);

    Casa buscarPorId(Long id);
}
