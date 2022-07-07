package com.cg.ofr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.ofr.exception.FlatNotFoundException;

@ControllerAdvice
public class FlatExceptionController {
	@ExceptionHandler(value=FlatNotFoundException.class)
	public ResponseEntity<Object>FlatCodeExceptionHandler(Exception ex){

		  return new ResponseEntity("Flat Not Found",HttpStatus.NOT_FOUND);
		  }

}
