package com.covid19.dto;

public class OverviewDto {
	private int confirmed; // 확진자
	private int recovered; // 격리해제
	private int active; // 격리중
	private int deaths; // 사망
	private String date;

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Overview [confirmed=" + confirmed + ", recovered=" + recovered + ", active=" + active + ", deaths="
				+ deaths + ", date=" + date + "]";
	}

}
