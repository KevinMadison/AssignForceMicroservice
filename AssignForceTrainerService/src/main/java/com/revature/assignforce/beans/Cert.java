package com.revature.assignforce.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CERTS")
public class Cert {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cert")
	@SequenceGenerator(name="cert", sequenceName="cert_seq", allocationSize=1)
	@Column(name="CERT_ID")
	private int certId;
	
	private String certName;
	
}
