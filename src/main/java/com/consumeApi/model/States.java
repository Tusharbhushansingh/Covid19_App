package com.consumeApi.model;

public class States {
	
	private String success;
	private Data data;
	private String lastRefreshed;
	private String lastOriginUpdate;
	
	public States() {
		
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getLastRefreshed() {
		return lastRefreshed;
	}

	public void setLastRefreshed(String lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}

	public String getLastOriginUpdate() {
		return lastOriginUpdate;
	}

	public void setLastOriginUpdate(String lastOriginUpdate) {
		this.lastOriginUpdate = lastOriginUpdate;
	}

	@Override
	public String toString() {
		return "States [success=" + success + ", data=" + data + ", lastRefreshed=" + lastRefreshed
				+ ", lastOriginUpdate=" + lastOriginUpdate + "]";
	}
}
