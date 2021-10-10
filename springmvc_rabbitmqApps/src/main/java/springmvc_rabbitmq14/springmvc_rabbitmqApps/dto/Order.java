package springmvc_rabbitmq14.springmvc_rabbitmqApps.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
	private String orderId;
	private String judul;
	private String isi;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public String getIsi() {
		return isi;
	}
	public void setIsi(String isi) {
		this.isi = isi;
	}
	
	
}
