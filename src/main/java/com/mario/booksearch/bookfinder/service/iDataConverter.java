package com.mario.booksearch.bookfinder.service;

public interface iDataConverter {
    <T> T getData(String json, Class<T> clazz);
}
