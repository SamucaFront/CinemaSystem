package com.cinema;

import java.time.LocalDateTime;

public class Sessao {
    private LocalDateTime horario;
    private Sala sala;
    private Filme filme;

    public Sessao() {}

    public Sessao(LocalDateTime horario, Sala sala, Filme filme) {
        this.horario = horario;
        this.sala = sala;
        this.filme = filme;
    }

    public LocalDateTime getHorario() { return horario; }
    public void setHorario(LocalDateTime horario) { this.horario = horario; }
    public Sala getSala() { return sala; }
    public void setSala(Sala sala) { this.sala = sala; }
    public Filme getFilme() { return filme; }
    public void setFilme(Filme filme) { this.filme = filme; }

    // Retorna true se a sessão já passou (encerrada)
    public boolean isEncerrada() {
        return horario != null && LocalDateTime.now().isAfter(horario);
    }
}
