package com.neven.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BastResult<T> {
    private String code;
    private String message;
    private T data;

    public BastResult(String code, String message){
        this(code,message,null);
    }
}
