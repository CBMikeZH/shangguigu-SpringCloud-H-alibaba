package com.mz.springcloud.api.entities.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonResult<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

}
