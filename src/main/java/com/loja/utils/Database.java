package com.loja.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:postgresql://localhost:5432/********"; // Substitua as estralas pelo nome do banco de dados.
    private static final String USER = "******"; // Substitua as estralas pelo Nome do Usuario do Banco.
    private static final String PASSWORD = "*******"; // Substitua as estralas pela Senha do banco do usuario.

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
