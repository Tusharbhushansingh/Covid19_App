package com.consumeApi.model;

public class Summary {
	private Long total;
	private Long confirmedCasesIndian;
	private Long confirmedCasesForeign;
	private Long discharged;
	private Long deaths;
	private Long confirmedButLocationUnidentified;
	
	public Summary() {
		
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getConfirmedCasesIndian() {
		return confirmedCasesIndian;
	}

	public void setConfirmedCasesIndian(Long confirmedCasesIndian) {
		this.confirmedCasesIndian = confirmedCasesIndian;
	}

	public Long getConfirmedCasesForeign() {
		return confirmedCasesForeign;
	}

	public void setConfirmedCasesForeign(Long confirmedCasesForeign) {
		this.confirmedCasesForeign = confirmedCasesForeign;
	}

	public Long getDischarged() {
		return discharged;
	}

	public void setDischarged(Long discharged) {
		this.discharged = discharged;
	}

	public Long getDeaths() {
		return deaths;
	}

	public void setDeaths(Long deaths) {
		this.deaths = deaths;
	}

	public Long getConfirmedButLocationUnidentified() {
		return confirmedButLocationUnidentified;
	}

	public void setConfirmedButLocationUnidentified(Long confirmedButLocationUnidentified) {
		this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
	}

	@Override
	public String toString() {
		return "Summary [total=" + total + ", confirmedCasesIndian=" + confirmedCasesIndian + ", confirmedCasesForeign="
				+ confirmedCasesForeign + ", discharged=" + discharged + ", deaths=" + deaths
				+ ", confirmedButLocationUnidentified=" + confirmedButLocationUnidentified + "]";
	}
}
