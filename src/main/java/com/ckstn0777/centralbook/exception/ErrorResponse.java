package com.ckstn0777.centralbook.exception;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ErrorResponse {
    private String status; // 상태코드
    private String errorField; // 필드
    private String errorMessage; // 에러메시지

    public ErrorResponse(String status, String errorField, String errorMessage) {
        this.status = status;
        this.errorField = errorField;
        this.errorMessage = errorMessage;
    }
}
