package com.kumaran.bean;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

public class CalcBean {
	@NumberFormat
	@NotNull
	private Number firstVal;
	@NumberFormat
	@NotNull
	private Number secondVal;

	public Number getFirstVal() {
		return firstVal;
	}
	public void setFirstVal(Number firstVal) {
		this.firstVal = firstVal;
	}

	public Number getSecondVal() {
		return secondVal;
	}

	public void setSecondVal(Number secondVal) {
		this.secondVal = secondVal;
	}
}
