package com.payten.sdk.msu.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.payten.sdk.msu.response.ApiResponse;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ResponseInfo {
	Class<? extends ApiResponse> responseClass() default ApiResponse.class;
}