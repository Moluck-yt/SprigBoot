package br.com.moluck.screematchspring.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
