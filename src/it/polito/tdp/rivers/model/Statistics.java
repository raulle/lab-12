package it.polito.tdp.rivers.model;

import java.time.LocalDate;

public class Statistics {
	
	private Integer numMis;
	private LocalDate PrimaData;
	private LocalDate UltimaData;
	private Double avg;
	
	public Statistics(int numMis, LocalDate primaData, LocalDate ultimaData, double avg) {
		super();
		this.numMis = numMis;
		PrimaData = primaData;
		UltimaData = ultimaData;
		this.avg = avg;
	}

	public Integer getNumMis() {
		return numMis;
	}

	public void setNumMis(int numMis) {
		this.numMis = numMis;
	}

	public LocalDate getPrimaData() {
		return PrimaData;
	}

	public void setPrimaData(LocalDate primaData) {
		PrimaData = primaData;
	}

	public LocalDate getUltimaData() {
		return UltimaData;
	}

	public void setUltimaData(LocalDate ultimaData) {
		UltimaData = ultimaData;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PrimaData == null) ? 0 : PrimaData.hashCode());
		result = prime * result + ((UltimaData == null) ? 0 : UltimaData.hashCode());
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numMis;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Statistics other = (Statistics) obj;
		if (PrimaData == null) {
			if (other.PrimaData != null)
				return false;
		} else if (!PrimaData.equals(other.PrimaData))
			return false;
		if (UltimaData == null) {
			if (other.UltimaData != null)
				return false;
		} else if (!UltimaData.equals(other.UltimaData))
			return false;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (numMis != other.numMis)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Statistics [numMis=" + numMis + ", PrimaData=" + PrimaData + ", UltimaData=" + UltimaData + ", avg="
				+ avg + "]";
	}
	
	

}
