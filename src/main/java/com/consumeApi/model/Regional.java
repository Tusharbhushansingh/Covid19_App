package com.consumeApi.model;

public class Regional {
	private String loc;
	private Long confirmedCasesIndian;
	private Long confirmedCasesForeign;
	private Long discharged;
	private Long deaths;
	private Long totalConfirmed;
	
	private Regional() {
		
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
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

	public Long getTotalConfirmed() {
		return totalConfirmed;
	}

	public void setTotalConfirmed(Long totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}

	@Override
	public String toString() {
		return "Regional [loc=" + loc + ", confirmedCasesIndian=" + confirmedCasesIndian + ", confirmedCasesForeign="
				+ confirmedCasesForeign + ", discharged=" + discharged + ", deaths=" + deaths + ", totalConfirmed="
				+ totalConfirmed + "]";
	}
}
