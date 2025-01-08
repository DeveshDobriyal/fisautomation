package com.fis.DTO;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataDTO {

	@SerializedName("time")
	@Expose
	private Time time;
	@SerializedName("disclaimer")
	@Expose
	private String disclaimer;
	@SerializedName("chartName")
	@Expose
	private String chartName;
	@SerializedName("bpi")
	@Expose
	private Bpi bpi;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public Bpi getBpi() {
		return bpi;
	}

	public void setBpi(Bpi bpi) {
		this.bpi = bpi;
	}

	public class Time {

		@SerializedName("updated")
		@Expose
		private String updated;
		@SerializedName("updatedISO")
		@Expose
		private String updatedISO;
		@SerializedName("updateduk")
		@Expose
		private String updateduk;

		public String getUpdated() {
			return updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public String getUpdatedISO() {
			return updatedISO;
		}

		public void setUpdatedISO(String updatedISO) {
			this.updatedISO = updatedISO;
		}

		public String getUpdateduk() {
			return updateduk;
		}

		public void setUpdateduk(String updateduk) {
			this.updateduk = updateduk;
		}

	}

	public class Bpi {

		@SerializedName("USD")
		@Expose
		private Usd usd;
		@SerializedName("GBP")
		@Expose
		private Gbp gbp;
		@SerializedName("EUR")
		@Expose
		private Eur eur;

		public Usd getUsd() {
			return usd;
		}

		public void setUsd(Usd usd) {
			this.usd = usd;
		}

		public Gbp getGbp() {
			return gbp;
		}

		public void setGbp(Gbp gbp) {
			this.gbp = gbp;
		}

		public Eur getEur() {
			return eur;
		}

		public void setEur(Eur eur) {
			this.eur = eur;
		}

		public class Usd {

			@SerializedName("code")
			@Expose
			private String code;
			@SerializedName("symbol")
			@Expose
			private String symbol;
			@SerializedName("rate")
			@Expose
			private String rate;
			@SerializedName("description")
			@Expose
			private String description;
			@SerializedName("rate_float")
			@Expose
			private Double rateFloat;

			public String getCode() {
				return code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getSymbol() {
				return symbol;
			}

			public void setSymbol(String symbol) {
				this.symbol = symbol;
			}

			public String getRate() {
				return rate;
			}

			public void setRate(String rate) {
				this.rate = rate;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Double getRateFloat() {
				return rateFloat;
			}

			public void setRateFloat(Double rateFloat) {
				this.rateFloat = rateFloat;
			}

		}

		public class Eur {

			@SerializedName("code")
			@Expose
			private String code;
			@SerializedName("symbol")
			@Expose
			private String symbol;
			@SerializedName("rate")
			@Expose
			private String rate;
			@SerializedName("description")
			@Expose
			private String description;
			@SerializedName("rate_float")
			@Expose
			private Double rateFloat;

			public String getCode() {
				return code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getSymbol() {
				return symbol;
			}

			public void setSymbol(String symbol) {
				this.symbol = symbol;
			}

			public String getRate() {
				return rate;
			}

			public void setRate(String rate) {
				this.rate = rate;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Double getRateFloat() {
				return rateFloat;
			}

			public void setRateFloat(Double rateFloat) {
				this.rateFloat = rateFloat;
			}

		}

		public class Gbp {

			@SerializedName("code")
			@Expose
			private String code;
			@SerializedName("symbol")
			@Expose
			private String symbol;
			@SerializedName("rate")
			@Expose
			private String rate;
			@SerializedName("description")
			@Expose
			private String description;
			@SerializedName("rate_float")
			@Expose
			private Double rateFloat;

			public String getCode() {
				return code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getSymbol() {
				return symbol;
			}

			public void setSymbol(String symbol) {
				this.symbol = symbol;
			}

			public String getRate() {
				return rate;
			}

			public void setRate(String rate) {
				this.rate = rate;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Double getRateFloat() {
				return rateFloat;
			}

			public void setRateFloat(Double rateFloat) {
				this.rateFloat = rateFloat;
			}

		}
	}
}