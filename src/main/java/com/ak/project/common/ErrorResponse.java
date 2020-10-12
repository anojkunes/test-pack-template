package com.ak.project.common;

import lombok.Data;

@Data
public class ErrorResponse {
    String errorCode;
    String errorMessage;
}