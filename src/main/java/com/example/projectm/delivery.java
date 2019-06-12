package com.example.projectm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery", schema ="wnFFWYkVxW")
public class delivery{


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "deliveryTable_id")
    private int deliveryTable_id;


	public int getDeliveryTable_id() {
		return this.deliveryTable_id;
	}

	public void setDeliveryTable_id(int deliveryTable_id) {
		this.deliveryTable_id = deliveryTable_id;
	}

    @Column(name = "delivery_id")
    private int delivery_id;

	public int getDelivery_id() {
		return this.delivery_id;
	}

	public void setDelivery_id(int delivery_id) {
		this.delivery_id = delivery_id;
	}

	


    @Column(name = "delivery_location")
    private String delivery_location;

	public String getDelivery_location() {
		return this.delivery_location;
	}

	public void setDelivery_location(String delivery_location) {
		this.delivery_location = delivery_location;
	}


    @Column(name = "delivery_date")
    private String delivery_date;

	public String getDelivery_date() {
		return this.delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}


    @Column(name = "delivery_type")
    private String delivery_type;

	public String getDelivery_type() {
		return this.delivery_type;
	}

	public void setDelivery_type(String delivery_type) {
		this.delivery_type = delivery_type;
	}

    @Column(name = "order_id")
     private int order_id;

	public int getOrder_id() {
		return this.order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

    @Column(name ="courier_id")
    private int courier_id;

	public int getCourier_id() {
		return this.courier_id;
	}

	public void setCourier_id(int courier_id) {
		this.courier_id = courier_id;
	}



	@Column(name = "delivery_status")
	private String delivery_status;

	public String getDelivery_status() {
		return this.delivery_status;
	}

	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}
    
}