package com.consumeApi.model;

import java.util.Arrays;

public class Data {

	private Summary summary;
	private Regional[] regional;
	
	public Data() {
		
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public Regional[] getRegional() {
		return regional;
	}

	public void setRegional(Regional[] regional) {
		this.regional = regional;
	}

	@Override
	public String toString() {
		return "Data [summary=" + summary + ", regional=" + Arrays.toString(regional) + "]";
	}
}
