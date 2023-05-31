package com.kachinga.asms.amcos.util;

import com.kachinga.asms.amcos.network.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

public final class Util {
    public static ResponseEntity<? extends ApiResponse<?>> respond(Object data, String message, HttpStatus httpStatus) {
        ApiResponse<?> response = new ApiResponse<>(message, data);
        return new ResponseEntity<>(response, httpStatus);
    }

    public static Long currentUserId(HttpServletRequest request) {
        return Long.valueOf(request.getHeader("X-auth-user-id"));
    }

    public static Long currentCompanyId(HttpServletRequest request) {
        return Long.valueOf(request.getHeader("X-auth-company-id"));
    }

    public static ResponseEntity<? extends ApiResponse<?>> respond(Object data) {
        ApiResponse<?> response = new ApiResponse<>(data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<? extends ApiResponse<?>> respond(Object data, String message) {
        ApiResponse<?> response = new ApiResponse<>(message, data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<? extends ApiResponse<?>> respond(Object data, HttpStatus httpStatus) {
        ApiResponse<?> response = new ApiResponse<>("Data", data);
        return new ResponseEntity<>(response, httpStatus);
    }

    public static ResponseEntity<? extends ApiResponse<?>> respond(String message, HttpStatus httpStatus) {
        ApiResponse<?> response = new ApiResponse<>(message);
        return new ResponseEntity<>(response, httpStatus);
    }

    public static void logger(Long companyId, String item, String message) {
        System.out.println(LocalDateTime.now() + " - Company ID: " + companyId + " - " + item + " -> " + message);
    }
}
