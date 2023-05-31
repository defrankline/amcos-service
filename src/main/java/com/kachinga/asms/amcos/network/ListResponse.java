package com.kachinga.asms.amcos.network;

import java.io.Serializable;

public class ListResponse<T> implements Serializable {
    private T data;

    public ListResponse() {
    }

    public ListResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
