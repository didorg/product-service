package com.dginebra.product_service.exception;

public class ApiException extends RuntimeException {

  private static final long serialVersionUID = 7993167659885567001L;

  public ApiException(String message) {
    super(message);
  }

  public ApiException(String message, Throwable cause) {
    super(message, cause);
  }
}
