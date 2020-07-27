package org.ryu.demo.dao.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Actor {

	private Short actor_id;

	private String first_name;

	private String last_name;

	private String film_info;

	public Short getActor_id() {
		return actor_id;
	}

	public void setActor_id(Short actor_id) {
		this.actor_id = actor_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name == null ? null : first_name.trim();
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name == null ? null : last_name.trim();
	}

	public String getFilm_info() {
		return film_info;
	}

	public void setFilm_info(String film_info) {
		this.film_info = film_info;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
}