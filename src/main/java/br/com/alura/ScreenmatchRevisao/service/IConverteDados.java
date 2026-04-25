package br.com.alura.ScreenmatchRevisao.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class <T> classe);
}
