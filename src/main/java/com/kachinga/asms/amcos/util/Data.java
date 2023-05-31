package com.kachinga.asms.amcos.util;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data<T> implements Serializable {
    private T data;
}
