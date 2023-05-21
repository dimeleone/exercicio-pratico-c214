package br.inatel.c214.countwords;

import java.util.List;

public interface Observer {
    void update(List<String> words);
}
