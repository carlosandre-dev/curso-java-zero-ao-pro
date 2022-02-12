package com.mentorama.handson;

import java.util.ArrayList;
import java.util.List;

public class AlunosDB {
    private List<Aluno> alunosList = new ArrayList<>();

    public List<Aluno> getAlunosList() {
        return alunosList;
    }

    public void addNovoAluno(Aluno aluno) {
        alunosList.add(aluno);
    }
}
