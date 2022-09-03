package com.ckstn0777.centralbook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    /**
     * 유효성체크에 통과하지 못하면  MethodArgumentNotValidException 이 발생한다.
     * 음... 여러개가 유효성체크 통과 못하면 배열로 넘겨줘야 되나? 일단 보류.
     * 수정) 그냥 에러명이랑 에러 메시지를 정해놓고 프론트랑 맞춰서 사용하는게 좋을 거 같다.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String status = HttpStatus.BAD_REQUEST.toString();
        // String errorField = e.getBindingResult().getFieldError().getField();
        // String errorMessage = e.getBindingResult().getFieldError().getDefaultMessage();

        ErrorResponse errorResponse = new ErrorResponse(status, "BadRequestError", "Bad Request");

        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
