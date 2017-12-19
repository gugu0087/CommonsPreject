package com.xyc.commomsproject.logic.model;

import java.util.List;

/**
 * Created by hasee on 2017/12/18.
 */

public class ResponseList<T> {
    private String code;
    private String message;
    private List<T> items;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

}
