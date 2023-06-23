package com.codingchallenge.springrestadminservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Users {
	    @Id
	    private Long id;
	    private String firstname;
	    private String surname;
	    private String position;
	    private String githubProfileUrl;
		public Users(Long id, String firstname, String surname, String position, String githubProfileUrl) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.surname = surname;
			this.position = position;
			this.githubProfileUrl = githubProfileUrl;
		}
		public Users() {
			super();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getGithubProfileUrl() {
			return githubProfileUrl;
		}
		public void setGithubProfileUrl(String githubProfileUrl) {
			this.githubProfileUrl = githubProfileUrl;
		}
		@Override
		public String toString() {
			return "Users [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", position=" + position
					+ ", githubProfileUrl=" + githubProfileUrl + "]";
		}
		
		
	    
	    

}
