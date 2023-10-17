package com.example.ecommersebackend.exception;


public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound( Integer errorCode , String message) {
        super(message+" with this code "+errorCode);
    }
}
