package com.springsecurity.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = true)
	private String name;
	@ManyToMany(mappedBy = "roles")
	private List<User> users = new ArrayList<>();
	
	
	public Role(String name, List<User> users) {
		this.name = name;
		this.users = users;
	}
	
	
}
