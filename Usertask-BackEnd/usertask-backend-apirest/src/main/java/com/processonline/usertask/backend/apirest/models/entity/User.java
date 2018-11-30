package com.processonline.usertask.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 4208350218298646057L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "no puede estar vacio")
	@Temporal(TemporalType.DATE)
	private Date birthdate;
	
	@NotEmpty(message ="no puede estar vacio")
	@Size(min=4, max=20, message="el tamaño tiene que estar entre 4 y 20")
	@Column(nullable=false, unique=true)
	private String name;

	@NotNull(message="Debe seleccionar un estado")
	@Type(type= "org.hibernate.type.NumericBooleanType")
	private Boolean active;
	
	@NotNull(message="la dependencia no puede ser vacia")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dependency_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Dependency dependency;
	
	@NotNull(message="el perfil no puede ser vacia")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="profile_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Profile profile;
	
	@NotNull(message="la tarea no puede ser vacia")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="row_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Row row;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	public Dependency getDependency() {
		return dependency;
	}

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Row getRow() {
		return row;
	}

	public void setRow(Row row) {
		this.row = row;
	}

}
