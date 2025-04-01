package com.loja.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:postgresql://localhost:5432/estoque_db"; // Substitua o nome do banco caso seja sua preferencia.
    private static final String USER = "seu_usuario"; // Substitua "seu_usuario" pelo Nome do Usuario do Banco.
    private static final String PASSWORD = "sua senha"; // Substitua "sua senha" pela Senha do banco do usuario.

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
