package com.ckstn0777.centralbook.exception;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ErrorResponse {
    private String status; // 상태코드
    private String errorName; // 에러네임(ex. UserExistsError, BadRequestError)
    private String errorMessage; // 에러메시지(ex. Bad Request)

    public ErrorResponse(String status, String errorName, String errorMessage) {
        this.status = status;
        this.errorName = errorName;
        this.errorMessage = errorMessage;
    }
}
