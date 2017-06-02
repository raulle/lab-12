package it.polito.tdp.rivers.model;

import java.time.LocalDate;

public class Flow {
	
	private int id;
	private LocalDate data;
	private double flusso;
	
	public Flow(int id, LocalDate data, double flusso) {
		super();
		this.id = id;
		this.data = data;
		this.flusso = flusso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getFlusso() {
		return flusso;
	}

	public void setFlusso(double flusso) {
		this.flusso = flusso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		long temp;
		temp = Double.doubleToLongBits(flusso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
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
		Flow other = (Flow) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (Double.doubleToLongBits(flusso) != Double.doubleToLongBits(other.flusso))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flow [id=" + id + ", data=" + data + ", flusso=" + flusso + "]";
	}
	
	
	
	

}
