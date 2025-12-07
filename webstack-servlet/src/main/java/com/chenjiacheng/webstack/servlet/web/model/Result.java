package com.chenjiacheng.webstack.servlet.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * Result
 *
 * @author chenjiacheng
 * @since 2025/12/7 21:50
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result <T> implements Serializable {

    private String code;
    private String msg;
    private T data;


    public static <T> Result<T> success(T data){
        return new Result<T>("200","success",data);
    }


}
