package com.geekbrains.cloud.jan.model;

public enum CommandType {
    FILE_MESSAGE,
    FILE_REQUEST,
    LIST,
    PATH_IN_REQUEST, //name
    PATH_UP_REQUEST,
    AUTH_REQUEST, //login, password
    AUTH_RESPONSE, // ok no
    REG_REQUEST  // name, surname, email, login, password
}
